#include <stdio.h>
#include <semaphore.h>
#include <pthread.h>

sem_t sync;

void* process1(void* arg) {
    printf("Process 1: Executing a\n");
    sem_post(&sync);
    return NULL;
}

void* process2(void* arg) {
    sem_wait(&sync);
    printf("Process 2: Executing b\n");
    return NULL;
}

int main() {
    sem_init(&sync, 0, 0);

    pthread_t t1, t2;
    pthread_create(&t1, NULL, process1, NULL);
    pthread_create(&t2, NULL, process2, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);

    sem_destroy(&sync);

    return 0;
}
