// CASE-I: Parent and Child Process Communication (Co-operative Processes)

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>

int main() {
    pid_t pid;
    char *fifo = "/tmp/myfifo";
    char write_message[] = "Message from parent";
    char read_message[100];

    mkfifo(fifo, 0666);

    pid = fork();

    if (pid == 0) {
        int fd = open(fifo, O_RDONLY);
        read(fd, read_message, sizeof(read_message));
        printf("Child received: %s\n", read_message);
        close(fd);
    } else {
        int fd = open(fifo, O_WRONLY);
        write(fd, write_message, strlen(write_message) + 1);
        close(fd);
        wait(NULL);
    }

    unlink(fifo);
    return 0;
}


// CASE-II: Communication Between Two Independent Processes
// Process 1 (Producer):

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>

int main() {
    char *fifo = "/tmp/myfifo";
    char write_message[] = "Message from process 1";
    
    mkfifo(fifo, 0666);
    
    int fd = open(fifo, O_WRONLY);
    write(fd, write_message, strlen(write_message) + 1);
    close(fd);
    
    return 0;
}

// Process 2 (Consumer):

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>

int main() {
    char *fifo = "/tmp/myfifo";
    char read_message[100];
    
    int fd = open(fifo, O_RDONLY);
    read(fd, read_message, sizeof(read_message));
    printf("Process 2 received: %s\n", read_message);
    close(fd);
    
    return 0;
}
