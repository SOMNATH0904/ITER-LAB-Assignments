#include <stdio.h>

int main() {
    int arr[] = {12, 45, 67, 23, 89, 10};
    int *ptr = arr, max = *ptr;

    for (int i = 1; i < 6; i++) {
        if (*(ptr + i) > max) {
            max = *(ptr + i);
        }
    }

    printf("Largest value: %d\n", max);

    return 0;
}
