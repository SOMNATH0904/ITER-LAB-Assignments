#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

void create_tree_a() {
    if (!fork()) {
        if (!fork()) {
            if (!fork()) {
                printf("Process ID: %d, Parent ID: %d\n", getpid(), getppid());
            }
        }
    } else {
        if (!fork()) {
            printf("Process ID: %d, Parent ID: %d\n", getpid(), getppid());
        } else {
            if (!fork()) {
                printf("Process ID: %d, Parent ID: %d\n", getpid(), getppid());
            }
        }
    }
}

int main() {
    printf("Process ID: %d, Parent ID: %d\n", getpid(), getppid());
    create_tree_a();
    return 0;
}
