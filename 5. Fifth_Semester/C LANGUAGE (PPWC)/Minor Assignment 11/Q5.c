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
    long types[] = {10, 30, 46, 67, 78, 88};

    for (int i = 0; i < 6; i++) {
        message.mtype = types[i];
        sprintf(message.mtext, "Message of type %ld", types[i]);
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

    msgrcv(msgid, &message, sizeof(message.mtext), -10, 0);
    printf("Received: %s\n", message.mtext);

    msgrcv(msgid, &message, sizeof(message.mtext), 100, IPC_NOWAIT);
    printf("Received: %s\n", message.mtext);

    msgrcv(msgid, &message, sizeof(message.mtext), -46, 0);
    printf("Received: %s\n", message.mtext);

    msgrcv(msgid, &message, sizeof(message.mtext), 0, 0);
    printf("Received: %s\n", message.mtext);

    msgrcv(msgid, &message, sizeof(message.mtext), 88, 0);
    printf("Received: %s\n", message.mtext);

    msgctl(msgid, IPC_RMID, NULL);
    return 0;
}
