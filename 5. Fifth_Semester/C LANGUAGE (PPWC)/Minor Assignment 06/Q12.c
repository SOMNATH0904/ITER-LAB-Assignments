#include <stdio.h>

int sum(int arr[], int n) {
    return (n == 0) ? 0 : arr[n - 1] + sum(arr, n - 1);
}

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    printf("Sum: %d", sum(arr, 5));
    return 0;
}

/*
Output: 
Sum: 15
*/