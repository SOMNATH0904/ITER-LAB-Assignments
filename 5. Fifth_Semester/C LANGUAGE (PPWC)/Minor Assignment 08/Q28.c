#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(int argc, char *argv[]) {
    if (argc != 2) {
        printf("Usage: %s <number_of_terms>\n", argv[0]);
        return 1;
    }

    int n = atoi(argv[1]);
    if (n <= 0) {
        printf("Please provide a positive integer for the number of terms.\n");
        return 1;
    }

    pid_t pid = fork();

    if (pid < 0) {
        printf("Fork failed.\n");
        return 1;
    } else if (pid == 0) {  
        printf("Child process generating Fibonacci sequence:\n");
        int a = 0, b = 1, next;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                printf("%d ", a);
            } else if (i == 1) {
                printf("%d ", b);
            } else {
                next = a + b;
                a = b;
                b = next;
                printf("%d ", next);
            }
        }
        printf("\n");
    } else { 
        wait(NULL); 
        printf("Parent process completed.\n");
    }

    return 0;
}
