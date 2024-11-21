#include <stdio.h>

int main() {
    int m = 10, n = 5;
    int *mp = &m, *np = &n;

    *mp = *mp + *np;  // m = 15
    *np = *mp - *np;  // n = 10

    printf("m: %d, *mp: %d\n", m, *mp);
    printf("n: %d, *np: %d\n", n, *np);

    return 0;
}
