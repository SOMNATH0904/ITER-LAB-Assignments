#include <stdio.h>
#include <unistd.h>
#include <string.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
    int pipefd[2];
    pid_t pid;
    char message[] = "Hello from child process!";
    char read_buffer[100];

    if (pipe(pipefd) == -1) {
        perror("pipe failed");
        return 1;
    }

    pid = fork();

    if (pid < 0) {
        perror("fork failed");
        return 1;
    }

    if (pid == 0) {
        close(pipefd[0]);
        if (write(pipefd[1], message, strlen(message) + 1) == -1) {
            perror("write failed");
            return 1;
        }
        close(pipefd[1]);
        return 0;
    } else {
        close(pipefd[1]);
        wait(NULL);
        if (read(pipefd[0], read_buffer, sizeof(read_buffer)) == -1) {
            perror("read failed");
            return 1;
        }
        printf("Message received from child: %s\n", read_buffer);
        close(pipefd[0]);
    }

    return 0;
}
