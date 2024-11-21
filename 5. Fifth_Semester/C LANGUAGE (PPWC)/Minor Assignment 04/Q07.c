#include <stdio.h>

int main() {
    int a = 52, b = 18;
    int *ptr1 = &a, *ptr2 = &b;

    printf("Greater value is: %d\n", (*ptr1 > *ptr2) ? *ptr1 : *ptr2);

    return 0;
}
