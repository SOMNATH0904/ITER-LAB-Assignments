#include <stdio.h>

int main() {
    int number;

    printf("Enter the number > ");
    scanf("%d", &number);
    printf("+-----------------------------------------+\n");
    printf("| ");
    for (int i = 1; i <= 10; i++) {
        printf("%d ", number * i);
    }
    printf("|\n");

    printf("| ");
    for (int i = 1; i <= 10; i++) {
        printf("%d ", i);
    }
    printf("|\n");

    printf("| ");
    for (int i = 1; i <= 10; i++) {
        printf("%d ", number);
    }
    printf("|\n");
    printf("+-----------------------------------------+\n");
    return 0;
}
