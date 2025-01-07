#include <stdio.h>

void print_fibo(int a, int b, int n) {
    if (n == 0) return;
    printf("%d ", a);
    print_fibo(b, a + b, n - 1);
}

int main() {
    int n = 5;
    printf("Fibonacci Series: ");
    print_fibo(0, 1, n);
    return 0;
}

/*
Fibonacci Series: 0 1 1 2 3
*/