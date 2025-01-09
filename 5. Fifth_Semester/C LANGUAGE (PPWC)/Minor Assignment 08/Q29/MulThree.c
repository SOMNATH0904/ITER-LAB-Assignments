#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
    if (argc != 4) {
        printf("Usage: %s num1 num2 num3\n", argv[0]);
        return 1;
    }

    int num1 = atoi(argv[1]);
    int num2 = atoi(argv[2]);
    int num3 = atoi(argv[3]);
    int result = num1 * num2 * num3;

    printf("The product of %d, %d, and %d is %d\n", num1, num2, num3, result);
    return 0;
}
