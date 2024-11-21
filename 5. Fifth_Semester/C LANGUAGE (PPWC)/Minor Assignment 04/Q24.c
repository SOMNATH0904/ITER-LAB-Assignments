#include <stdio.h>
#include <string.h>

void reverse(char *str) {
    int len = strlen(str);
    char *start = str, *end = str + len - 1;

    while (start < end) {
        char temp = *start;
        *start = *end;
        *end = temp;
        start++;
        end--;
    }
}

int main() {
    char str[100];
    printf("Enter a string: ");
    scanf("%s", str);

    reverse(str);
    printf("Reversed string: %s\n", str);

    return 0;
}
