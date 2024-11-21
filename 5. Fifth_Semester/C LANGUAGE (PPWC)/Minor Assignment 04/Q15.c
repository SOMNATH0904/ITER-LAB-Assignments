#include <stdio.h>

int main() {
    int a = 55, b = 105, c = 89, d = 68;
    int *arr[] = {&a, &b, &c, &d};
    int *max = arr[0];

    for (int i = 1; i < 4; i++) {
        if (*arr[i] > *max) {
            max = arr[i];
        }
    }

    printf("Maximum value: %d\n", *max);

    return 0;
}
