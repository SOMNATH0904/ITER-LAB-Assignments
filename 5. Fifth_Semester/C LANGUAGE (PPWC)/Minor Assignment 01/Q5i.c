#include<stdio.h>
int main() {
    double x=3000.0, y=0.0035;
    printf("%f %f %f\n",x,y,x*y,x/y);
    printf("%e %e %e\n",x,y,x*y,x/y);
    printf("%E %E %E\n",x,y,x*y,x/y);
    return 0;
}

/*
Output ->
3000.000000 0.003500 10.500000
3.000000e+003 3.500000e-003 1.050000e+001
3.000000E+003 3.500000E-003 1.050000E+001
*/