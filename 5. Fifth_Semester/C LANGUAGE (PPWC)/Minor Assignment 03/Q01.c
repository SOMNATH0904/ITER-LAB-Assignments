#include<stdio.h>

int main() {
    int prime_lt_100[] = {2, 3, 5, 7, 11, 13, 17,
                          19, 23, 29, 31, 37,41, 43, 47, 53, 59,
                          61, 67, 71, 73, 79, 83, 89, 97};
    printf("%d\n", prime_lt_100[24]);
    int i=10; 
    printf("%d\n", prime_lt_100[i+4]);
    printf("%d\n", prime_lt_100[prime_lt_100[2] + prime_lt_100[0]]);
    prime_lt_100[6] = prime_lt_100[6] + prime_lt_100[16];
    printf("%d", prime_lt_100[6]);
    return 0;
}

/*
OUTPUT ->
97
47
19
76
*/