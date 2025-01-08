#include <stdio.h>
#include <semaphore.h>
#include <pthread.h>

sem_t S, Q;

void* process1(void* arg) {
    for (;;) {
        sem_wait(&Q);
        sem_wait(&S);
        printf("Process 1: Executing a\n");
        sem_post(&S);
        sem_post(&Q);
    }
    return NULL;
}

void* process2(void* arg) {
    for (;;) {
        sem_wait(&S);
        sem_wait(&Q);
        printf("Process 2: Executing b\n");
        sem_post(&Q);
        sem_post(&S);
    }
    return NULL;
}

int main() {
    sem_init(&S, 0, 1);
    sem_init(&Q, 0, 1);

    pthread_t t1, t2;
    pthread_create(&t1, NULL, process1, NULL);
    pthread_create(&t2, NULL, process2, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);

    sem_destroy(&S);
    sem_destroy(&Q);

    return 0;
}
