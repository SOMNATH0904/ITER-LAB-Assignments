#include <stdio.h>

int main() {
    int ia = 345;
    float fb = 4.5;
    char chvar = 'Z';

    printf("Values:\n ia: %d\n fb: %.2f\n chvar: %c\n", ia, fb, chvar);
    printf("Addresses:\n &ia: %p\n &fb: %p\n &chvar: %p\n", &ia, &fb, &chvar);

    return 0;
}
