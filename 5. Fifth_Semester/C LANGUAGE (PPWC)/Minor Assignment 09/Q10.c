#include <stdio.h>
#include <unistd.h>
#include <string.h>

int main() {
    int pipefd[2];
    char message[] = "Hello from pipe!";
    char read_buffer[100];

    // Create the pipe
    if (pipe(pipefd) == -1) {
        perror("pipe failed");
        return 1;
    }

    // Write to the pipe
    if (write(pipefd[1], message, strlen(message) + 1) == -1) {
        perror("write failed");
        return 1;
    }

    // Read from the pipe
    if (read(pipefd[0], read_buffer, sizeof(read_buffer)) == -1) {
        perror("read failed");
        return 1;
    }

    printf("Message received from pipe: %s\n", read_buffer);

    return 0;
}
