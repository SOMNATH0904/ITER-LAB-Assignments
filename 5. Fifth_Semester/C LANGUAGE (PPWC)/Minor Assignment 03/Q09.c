#include <stdio.h>
#include <string.h>

void countCharacters(const char *str) {
    int count[256] = {0}; 
    int length = strlen(str);

    for (int i = 0; i < length; i++) {
        unsigned char ch = str[i];
        count[ch]++;
    }

    printf("The count of each character in the string '%s' is: ", str);
    for (int i = 0; i < 256; i++) {
        if (count[i] > 0) {
            printf("%c-%d, ", i, count[i]);
        }
    }
    printf("\b\b.\n"); 
}

int main() {
    const char *str = "bintu";
    countCharacters(str);
    return 0;
}

/*
OUTPUT ->
The count of each character in the string 'bintu' is: b-1, i-1, n-1, t-1, u-1.
*/