#include <stdio.h>

// Prototype declaration
void sum_n_avg(double a, double b, double c, double *sum, double *avg);

int main() {
    double one, two, three, sum_of_3, avg_of_3;

    printf("Enter three numbers: ");
    scanf("%lf %lf %lf", &one, &two, &three);

    // Call the function
    sum_n_avg(one, two, three, &sum_of_3, &avg_of_3);

    printf("Sum: %.2f, Average: %.2f\n", sum_of_3, avg_of_3);

    return 0;
}
