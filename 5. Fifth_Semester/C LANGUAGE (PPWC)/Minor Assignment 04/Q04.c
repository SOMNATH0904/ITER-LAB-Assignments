#include <stdio.h>

int main() {
    int x = 89;
    int *p1 = &x, *p2 = &x, *p3 = &x;

    printf("Value of x through p1: %d\n", *p1);
    *p3 = 100;
    printf("Updated value of x through p3: %d\n", *p3);

    return 0;
}
