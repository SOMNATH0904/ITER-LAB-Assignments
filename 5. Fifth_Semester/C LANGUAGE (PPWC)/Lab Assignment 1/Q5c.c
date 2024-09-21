#include<stdio.h>
int main(){
    char ch = 'A';
    print("%d",sizeof(ch));
    print("%d",sizeof('A'));
    return 0;
}

// Output: warning: implicit declaration of function 'print' [-Wimplicit-function-declaration]
//         print("%d", sizeof(ch));