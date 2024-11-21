#include <stdio.h>

int main() {
    int a = 12, b = 25, c = 18;
    int *ptrA = &a, *ptrB = &b, *ptrC = &c;
    
    *ptrA += 10;
    *ptrB += 10;
    *ptrC += 10;

    printf("Updated values:\n a: %d\n b: %d\n c: %d\n", a, b, c);
    return 0;
}
