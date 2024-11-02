#include <stdio.h>

void sumarr(int a[], int b[], int r[], int size) {
    for (int i = 0; i < size; i++) {
        r[i] = a[i] + b[i];
    }
}

int main() {
    int a[] = {5, -1, 7};
    int b[] = {2, 4, -2};
    int size = sizeof(a) / sizeof(a[0]);
    int r[size];

    sumarr(a, b, r, size);

    printf("Resultant array: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", r[i]);
    }
    return 0;
}

/*
OUTPUT ->
Resultant array: 7 3 5
*/