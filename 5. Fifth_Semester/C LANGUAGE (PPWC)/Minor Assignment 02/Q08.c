#include <stdio.h>

double calculateNaturalLogApproximation(double x) {
    double sum = 0.0;
    double term = (x - 1) / x;

    for (int n = 1; n <= 9; n++) {
        double currentTerm = (1.0 / (2.0 * n)) * pow(term, n);
        sum += currentTerm;
    }

    return sum;
}

int main() {
    double x;

    printf("Enter a value for x: ");
    scanf("%lf", &x);

    if (x <= 0) {
        printf("Please enter a positive value for x.\n");
    } else {
        double result = calculateNaturalLogApproximation(x);
        printf("The approximation of the natural logarithm for x = %.2f using the first 9 terms is: %.6f\n", x, result);
    }

    return 0;
}
