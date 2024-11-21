#include <stdio.h>

int main() {
    int a[] = {1, 2, 3, 4};
    int b[] = {5, 6, 7, 8};
    int c[] = {9, 10, 11, 12};
    int d[] = {13, 14, 15, 16};
    int sum[4];
    int *arrays[] = {a, b, c, d};

    for (int i = 0; i < 4; i++) {
        sum[i] = arrays[0][i] + arrays[1][i] + arrays[2][i] + arrays[3][i];
    }

    for (int i = 0; i < 4; i++) {
        printf("Sum[%d]: %d\n", i, sum[i]);
    }

    return 0;
}
