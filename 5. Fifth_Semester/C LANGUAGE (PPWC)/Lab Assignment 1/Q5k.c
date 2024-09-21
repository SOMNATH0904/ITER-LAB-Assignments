#include<stdio.h>
int main(){
    int a, b, c;
    printf("Enter in decimal format:");
    scanf("%d", &a);
    printf("Enter in octal format: ");
    scanf("%d", &b);
    printf("Enter in hexadecimal format: ");
    scanf("%d", &c);
    printf("a = %d, b = %d, c = %d", a, b, c);
    printf("Enter in decimal format:");
    scanf("%i", &b);
    printf("Enter in octal format: ");
    scanf("%i", &b);
    printf("Enter in hexadecimal format: ");
    scanf("%i", &c);
    printf("a = %i, b = %i, c = %i\n", a, b, c);
    return 0;
}

/*
Output ->
Enter in decimal format:4
Enter in octal format: 010
Enter in hexadecimal format: 0010
a = 4, b = 10, c = 10Enter in decimal format:10
Enter in octal format: 0010
Enter in hexadecimal format: 0111001
a = 4, b = 8, c = 37377
*/