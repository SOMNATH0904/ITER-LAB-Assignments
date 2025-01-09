#include <stdio.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <unistd.h>

int main() {
    int shmid = shmget(IPC_PRIVATE, sizeof(int), IPC_CREAT | 0666);
    int *shm = (int *)shmat(shmid, NULL, 0);

    if (fork() == 0) {
        *shm = 5;
        printf("Child wrote: %d\n", *shm);
        shmdt(shm);
    } else {
        wait(NULL);
        printf("Parent read: %d\n", *shm);
        *shm *= 2;
        printf("Parent updated to: %d\n", *shm);
        shmdt(shm);
        shmctl(shmid, IPC_RMID, NULL);
    }
    return 0;
}
