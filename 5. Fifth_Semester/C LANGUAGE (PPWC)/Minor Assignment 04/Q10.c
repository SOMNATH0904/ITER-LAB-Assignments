#include <stdio.h>

int main() {
    int a[] = {120, 502, 118, 188, 106, 447};
    int *ptr1 = &a[0], *ptr2 = &a[1], *ptr3 = &a[2];
    int *ptr4 = &a[3], *ptr5 = &a[4], *ptr6 = &a[5];

    printf("Array contents using individual pointers:\n");
    printf("ptr1: %d, ptr2: %d, ptr3: %d\n", *ptr1, *ptr2, *ptr3);
    printf("ptr4: %d, ptr5: %d, ptr6: %d\n", *ptr4, *ptr5, *ptr6);

    return 0;
}
