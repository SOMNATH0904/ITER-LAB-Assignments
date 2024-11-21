#include <stdio.h>

int main() {
    int a[] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
    for (int i = 0; i < 10; i++) {
        printf("Index: %d, Value: %d, Address: %p\n", i, a[i], &a[i]);
    }
    return 0;
}
