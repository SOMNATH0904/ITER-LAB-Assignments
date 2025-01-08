#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int shrd = 0;

void process1() {
    int x = shrd;
    x = x + 1;
    sleep(1);
    shrd = x;
}

void process2() {
    int y = shrd;
    y = y - 1;
    sleep(1);
    shrd = y;
}

int main() {
    pid_t pid = fork();

    if (pid == 0) {
        process1();
        printf("Child Process: Shared = %d\n", shrd);
    } else if (pid > 0) {
        process2();
        printf("Parent Process: Shared = %d\n", shrd);
        wait(NULL);
    }

    return 0;
}
