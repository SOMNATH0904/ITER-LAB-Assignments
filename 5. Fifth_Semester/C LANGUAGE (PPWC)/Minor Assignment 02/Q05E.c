#include<stdio.h>
int main() {
    int i, j,n=5;
    for(i=1, j=1; j<= n; i+= 2, j++){
        printf("%d%d\n", i, j);
    }
    return 0;
}

/*
OUTPUT ->
11
32
53
74
95
*/