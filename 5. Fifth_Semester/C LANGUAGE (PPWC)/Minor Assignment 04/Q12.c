#include <stdio.h>

int main() {
    int a[] = {120, 502, 118, 188, 106, 447};
    int *ptr = a;

    for (int i = 0; i < 6; i++) {
        printf("a[%d]: Value = %d, Address = %p\n", i, *(ptr + i), ptr + i);
    }

    return 0;
}
