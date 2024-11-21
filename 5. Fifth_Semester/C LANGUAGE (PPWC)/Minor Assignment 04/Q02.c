#include <stdio.h>

int main() {
    int a = 10, b = 20;
    printf("Before Swap:\n a = %d at %p\n b = %d at %p\n", a, &a, b, &b);

    int temp = a;
    a = b;
    b = temp;

    printf("After Swap:\n a = %d at %p\n b = %d at %p\n", a, &a, b, &b);
    return 0;
}
