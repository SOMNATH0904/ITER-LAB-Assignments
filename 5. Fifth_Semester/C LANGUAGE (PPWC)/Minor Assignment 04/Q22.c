#include <stdio.h>

void sum(int a, int b, int *cp) {
    *cp = a + b;
}

int main() {
    int x = 7, y = 2, z;

    printf("x y z\n");
    sum(x, y, &z);
    printf("%4d%4d%4d\n", x, y, z);
    sum(y, x, &z);
    printf("%4d%4d%4d\n", x, y, z);
    sum(z, y, &x);
    printf("%4d%4d%4d\n", x, y, z);
    sum(z, z, &x);
    printf("%4d%4d%4d\n", x, y, z);
    sum(y, y, &y);
    printf("%4d%4d%4d\n", x, y, z);

    return 0;
}
