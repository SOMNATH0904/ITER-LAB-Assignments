#include <stdio.h>

// Function prototype for sum and average calculation
void sum_n_avg(double a, double b, double c, double *sum, double *avg);

void sum_n_avg(double a, double b, double c, double *sum, double *avg) {
    *sum = a + b + c;
    *avg = *sum / 3.0;
}
