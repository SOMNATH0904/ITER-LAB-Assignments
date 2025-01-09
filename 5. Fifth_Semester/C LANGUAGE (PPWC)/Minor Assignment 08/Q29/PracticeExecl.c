#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
    pid_t pid;
    int status;

    pid = fork();

    if (pid < 0) {
        perror("Fork failed");
        return 1;
    }

    if (pid == 0) {
        execl("./MulThree", "./MulThree", "2", "3", "4", NULL);
        perror("execl failed");
        exit(1);
    } else {
        wait(&status);
        if (WIFEXITED(status)) {
            printf("Child process ID: %d\n", pid);
            printf("Child exited with status: %d\n", WEXITSTATUS(status));
        } else {
            printf("Child process did not exit normally\n");
        }
    }

    return 0;
}

