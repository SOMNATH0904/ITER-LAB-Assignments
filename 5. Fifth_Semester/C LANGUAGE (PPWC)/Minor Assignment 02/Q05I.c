#include <stdio.h>
int main() {
    int i = 0 ;
    while(i++) {
        printf( "%d ",i);
        if (i > 2 )
            break ;
    }
    return (0);
}