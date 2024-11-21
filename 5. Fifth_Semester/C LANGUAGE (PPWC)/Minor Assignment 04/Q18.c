#include <stdio.h>
#include <stdlib.h>

int main() {
    int *arr = (int *)malloc(4 * sizeof(int));
    for (int i = 0; i < 4; i++) {
        arr[i] = i + 1;
        printf("arr[%d]: %d\n", i, arr[i]);
    }
    free(arr);
    return 0;
}
