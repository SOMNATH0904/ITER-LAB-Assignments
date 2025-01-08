#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    pid_t pid;
    for (int i = 1; i <= 5; i++) {
        pid = fork();

        if (pid == 0) {  // Child process
            switch (i) {
                case 1: fprintf(stderr, "WHO: "); break;
                case 2: fprintf(stderr, "Coronavirus "); break;
                case 3: fprintf(stderr, "disease "); break;
                case 4: fprintf(stderr, "COVID-19 "); break;
                case 5: fprintf(stderr, "pandemic\n"); break;
            }
            exit(0);  // Child exits after printing
        } else if (pid < 0) {
            perror("Fork failed");
            exit(1);
        }
    }

    // Parent waits for all children
    for (int i = 0; i < 5; i++) {
        wait(NULL);
    }

    return 0;
}
