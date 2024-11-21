#include <stdio.h>

int main() {
    int arr1[] = {10, 13, 20, 33, 44};
    double arr2[] = {10.2, 13.3, 20.0, 33.3, 45.3};

    for (int i = 0; i < 5; i++) {
        printf("arr1[%d]: Value = %d, Address = %p\n", i, arr1[i], &arr1[i]);
        printf("arr2[%d]: Value = %.1f, Address = %p\n", i, arr2[i], &arr2[i]);
    }

    return 0;
}
