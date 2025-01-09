// Sender

#include <stdio.h>
#include <string.h>
#include <sys/ipc.h>
#include <sys/msg.h>

struct msgbuf {
    long mtype;
    char mtext[100];
};

void encrypt(char *text, int key) {
    for (int i = 0; i < strlen(text); i++) {
        if (text[i] >= 'a' && text[i] <= 'z')
            text[i] = ((text[i] - 'a' + key) % 26) + 'a';
        else if (text[i] >= 'A' && text[i] <= 'Z')
            text[i] = ((text[i] - 'A' + key) % 26) + 'A';
    }
}

int main() {
    int msgid = msgget(1234, IPC_CREAT | 0666);
    struct msgbuf message;
    char text[] = "ATTACKATONCE";
    int key = 5;

    encrypt(text, key);
    sprintf(message.mtext, "%d %s", key, text);
    message.mtype = 1;
    msgsnd(msgid, &message, sizeof(message.mtext), 0);

    return 0;
}


// Receiver

#include <stdio.h>
#include <string.h>
#include <sys/ipc.h>
#include <sys/msg.h>

struct msgbuf {
    long mtype;
    char mtext[100];
};

void decrypt(char *text, int key) {
    for (int i = 0; i < strlen(text); i++) {
        if (text[i] >= 'a' && text[i] <= 'z')
            text[i] = ((text[i] - 'a' - key + 26) % 26) + 'a';
        else if (text[i] >= 'A' && text[i] <= 'Z')
            text[i] = ((text[i] - 'A' - key + 26) % 26) + 'A';
    }
}

int main() {
    int msgid = msgget(1234, 0666);
    struct msgbuf message;

    msgrcv(msgid, &message, sizeof(message.mtext), 1, 0);
    int key;
    char text[100];
    sscanf(message.mtext, "%d %[^\n]", &key, text);

    decrypt(text, key);
    printf("Decrypted Message: %s\n", text);

    msgctl(msgid, IPC_RMID, NULL);
    return 0;
}
