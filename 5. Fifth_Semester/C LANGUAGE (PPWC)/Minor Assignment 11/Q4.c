// Sender

#include <stdio.h>
#include <sys/ipc.h>
#include <sys/msg.h>

struct msgbuf {
    long mtype;
    char mtext[100];
};

int main() {
    int msgid = msgget(1234, IPC_CREAT | 0666);
    struct msgbuf message;

    for (int i = 1; i <= 4; i++) {
        message.mtype = i;
        sprintf(message.mtext, "Message %d", i);
        msgsnd(msgid, &message, sizeof(message.mtext), 0);
    }

    return 0;
}


// Receiver

#include <stdio.h>
#include <sys/ipc.h>
#include <sys/msg.h>

struct msgbuf {
    long mtype;
    char mtext[100];
};

int main() {
    int msgid = msgget(1234, 0666);
    struct msgbuf message;

    while (msgrcv(msgid, &message, sizeof(message.mtext), 0, IPC_NOWAIT) != -1) {
        printf("Received: %s\n", message.mtext);
    }

    msgctl(msgid, IPC_RMID, NULL);
    return 0;
}
