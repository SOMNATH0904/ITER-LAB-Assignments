#include <stdio.h>

int main() {
    double x = 6.7, y = 1.2, z = 2.3;
    double *p = &x;

    printf("Values through pointer:\n x: %.1f\n y: %.1f\n z: %.1f\n", *p, *(p + 1), *(p + 2));

    return 0;
}
