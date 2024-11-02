#include <stdio.h>

void mergeSortedArrays(int arr1[], int m, int arr2[], int n, int merged[]) {
    int i = 0, j = 0, k = 0;
    while (i < m && j < n) {
        if (arr1[i] < arr2[j]) {
            merged[k++] = arr1[i++];
        } else {
            merged[k++] = arr2[j++];
        }
    }
    while (i < m) {
        merged[k++] = arr1[i++];
    }
    while (j < n) {
        merged[k++] = arr2[j++];
    }
}

int main() {
    int arr1[] = {12, 20, 24, 32};
    int arr2[] = {7, 8, 65, 105};
    int m = sizeof(arr1) / sizeof(arr1[0]);
    int n = sizeof(arr2) / sizeof(arr2[0]);
    int merged[m + n];

    mergeSortedArrays(arr1, m, arr2, n, merged);

    printf("Merged sorted array: ");
    for (int i = 0; i < m + n; i++) {
        printf("%d ", merged[i]);
    }
    return 0;
}

/*
OUTPUT ->
Merged sorted array: 7 8 12 20 24 32 65 105 
*/