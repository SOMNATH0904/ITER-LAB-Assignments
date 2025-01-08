#include <stdio.h>
#include <semaphore.h>
#include <pthread.h>

sem_t semX, semY, semZ;

void* process1(void* arg) {
    for (int i = 0; i < 5; ++i) {  // Adjust repetitions as needed.
        sem_wait(&semX);
        printf("X");
        printf("X");
        sem_post(&semY);
    }
    return NULL;
}

void* process2(void* arg) {
    for (int i = 0; i < 5; ++i) {
        sem_wait(&semY);
        printf("Y");
        sem_post(&semZ);
    }
    return NULL;
}

void* process3(void* arg) {
    for (int i = 0; i < 5; ++i) {
        sem_wait(&semZ);
        printf("Z");
        printf("Z");
        sem_post(&semX);
    }
    return NULL;
}

int main() {
    sem_init(&semX, 0, 1);
    sem_init(&semY, 0, 0);
    sem_init(&semZ, 0, 0);

    pthread_t t1, t2, t3;
    pthread_create(&t1, NULL, process1, NULL);
    pthread_create(&t2, NULL, process2, NULL);
    pthread_create(&t3, NULL, process3, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);
    pthread_join(t3, NULL);

    sem_destroy(&semX);
    sem_destroy(&semY);
    sem_destroy(&semZ);

    return 0;
}
