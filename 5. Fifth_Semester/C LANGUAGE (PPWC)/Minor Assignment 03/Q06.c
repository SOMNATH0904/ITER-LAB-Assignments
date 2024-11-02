#include <stdio.h>

int isPresent(int arr[], int size, int element) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == element) {
            return 1;
        }
    }
    return 0;
}

int findDifference(int p[], int m, int q[], int n, int result[]) {
    int k = 0;
    for (int i = 0; i < m; i++) {
        if (!isPresent(q, n, p[i])) {
            result[k++] = p[i];
        }
    }
    return k;
}

int main() {
    int p[] = {1, 2, 3, 4};
    int q[] = {2, 4, 5, 6};
    int m = sizeof(p) / sizeof(p[0]);
    int n = sizeof(q) / sizeof(q[0]);
    int result[m];
    
    int resultSize = findDifference(p, m, q, n, result);

    printf("Difference (p - q): ");
    for (int i = 0; i < resultSize; i++) {
        printf("%d ", result[i]);
    }
    return 0;
}

/*
OUTPUT ->
Difference (p - q): 1 3 
*/