#include<stdio.h>
int main(){
    char ch=97;
    print("%d", sizeof(ch+4));
}

// Output: warning: implicit declaration of function 'print' [-Wimplicit-function-declaration]
//         print("%d", sizeof(ch+4));