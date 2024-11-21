#include <stdio.h>

int main() {
    int a = 12, b = 25, c = 18;
    int *ptr = &a;

    for (int i = 0; i < 3; i++) {
        *(ptr + i) += 10;
    }

    printf("Updated values:\n a: %d\n b: %d\n c: %d\n", a, b, c);
    return 0;
}
