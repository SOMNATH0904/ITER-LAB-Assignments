#include <stdio.h>
#include <sys/ipc.h>
#include <sys/shm.h>

int main() {
    int shmid = shmget(IPC_PRIVATE, 10, IPC_CREAT | 0666);
    if (shmid == -1) return 1;

    char *shm1 = (char *)shmat(shmid, NULL, 0);
    char *shm2 = (char *)shmat(shmid, NULL, 0);
    char *shm3 = (char *)shmat(shmid, NULL, 0);
    char *shm4 = (char *)shmat(shmid, NULL, 0);

    struct shmid_ds buf;
    shmctl(shmid, IPC_STAT, &buf);

    printf("Number of attachments: %ld\n", buf.shm_nattch);

    shmdt(shm1);
    shmdt(shm2);
    shmdt(shm3);
    shmdt(shm4);
    shmctl(shmid, IPC_RMID, NULL);

    return 0;
}
