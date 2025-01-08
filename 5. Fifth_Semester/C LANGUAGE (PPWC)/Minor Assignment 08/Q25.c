#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

void create_process_tree() {
    if (!fork()) {
        printf("Process ID: %d, Parent ID: %d\n", getpid(), getppid());
        if (!fork()) {
            printf("Process ID: %d, Parent ID: %d\n", getpid(), getppid());
            if (!fork()) {
                printf("Process ID: %d, Parent ID: %d\n", getpid(), getppid());
            } else {
                wait(NULL);
            }
        } else {
            wait(NULL);
        }
    } else {
        if (!fork()) {
            printf("Process ID: %d, Parent ID: %d\n", getpid(), getppid());
            if (!fork()) {
                printf("Process ID: %d, Parent ID: %d\n", getpid(), getppid());
            } else {
                if (!fork()) {
                    printf("Process ID: %d, Parent ID: %d\n", getpid(), getppid());
                    if (!fork()) {
                        printf("Process ID: %d, Parent ID: %d\n", getpid(), getppid());
                    } else {
                        wait(NULL);
                    }
                } else {
                    wait(NULL);
                }
            }
        } else {
            wait(NULL);
        }
    }
}

int main() {
    create_process_tree();
    return 0;
}
