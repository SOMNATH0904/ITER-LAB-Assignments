#include <stdio.h>

int isDistinct(int arr[], int size, int element) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == element) {
            return 0; 
        }
    }
    return 1; 
}

int copyDistinctElements(int input[], int size, int output[]) {
    int outputSize = 0;
    for (int i = 0; i < size; i++) {
        if (isDistinct(output, outputSize, input[i])) {
            output[outputSize++] = input[i]; 
        }
    }
    return outputSize; 
}

int main() {
    int input[] = {4, 7, 7, 3, 2, 5, 5};
    int size = sizeof(input) / sizeof(input[0]);
    int output[size]; 
    int distinctSize = copyDistinctElements(input, size, output);

    printf("Distinct elements: ");
    for (int i = 0; i < distinctSize; i++) {
        printf("%d ", output[i]);
    }
    return 0;
}

/*
OUTPUT ->
Distinct elements: 4 7 3 2 5
*/