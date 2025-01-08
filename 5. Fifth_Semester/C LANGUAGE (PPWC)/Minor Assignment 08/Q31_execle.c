#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

int main(int argc, char *argv[], char *envp[]) {
    if (argc != 4) {
        fprintf(stderr, "Usage: %s <pattern> <filename>\n", argv[0]);
        return 1;
    }

    pid_t pid = fork();

    if (pid < 0) {
        perror("fork failed");
        return 1;
    }

    if (pid == 0) {
        // Using execle to execute the grep command
        execle("/bin/grep", "grep", "-n", argv[1], argv[2], (char *)NULL, envp);
        perror("execle failed");
        exit(1);
    } else {
        int status;
        pid_t child_pid = wait(&status);

        if (child_pid == -1) {
            perror("wait failed");
            return 1;
        }

        printf("Child process ID: %d\n", child_pid);
        if (WIFEXITED(status)) {
            printf("Child exited with status: %d\n", WEXITSTATUS(status));
        } else {
            printf("Child process terminated abnormally\n");
        }
    }

    return 0;
}
