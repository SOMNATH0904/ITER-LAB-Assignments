// shmwriter.c

#include <stdio.h>
#include <sys/ipc.h>
#include <sys/shm.h>

int main() {
    int shmid = shmget(1234, sizeof(int), IPC_CREAT | 0666);
    int *data = (int *)shmat(shmid, NULL, 0);

    *data = 500;
    printf("Value written: %d\n", *data);

    shmdt(data);
    return 0;
}


// shmreader.c

#include <stdio.h>
#include <sys/ipc.h>
#include <sys/shm.h>

int main() {
    int shmid = shmget(1234, sizeof(int), 0666);
    int *data = (int *)shmat(shmid, NULL, 0);

    printf("Value read: %d\n", *data);
    *data = 600;

    printf("Value updated: %d\n", *data);
    shmdt(data);
    return 0;
}
