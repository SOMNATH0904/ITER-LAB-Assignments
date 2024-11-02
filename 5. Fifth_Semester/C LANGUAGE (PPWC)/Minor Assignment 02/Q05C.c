#include<stdio.h>
int main(){
    int i = 0;
    while (i <= 5) {
        printf("%3d %3d\n", i, 10 - i);
        i = i + 1;
    }
    return 0;
}

/*
OUTPUT ->
 0  10
 1   9
 2   8
 3   7
 4   6
 5   5
*/