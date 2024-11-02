#include <stdio.h>
#include <string.h>

char firstRepetitiveCharacter(const char *str) {
    int seen[256] = {0}; 

    for (int i = 0; str[i] != '\0'; i++) {
        unsigned char ch = str[i];
        seen[ch]++;
        
        if (seen[ch] > 1) {
            return ch;
        }
    }
    return '\0';
}

int main() {
    const char *str = "racecar";
    char result = firstRepetitiveCharacter(str);

    if (result != '\0') {
        printf("The first repetitive character in the string '%s' is '%c'.\n", str, result);
    } else {
        printf("There are no repetitive characters in the string '%s'.\n", str);
    }
    
    return 0;
}

/*
OUTPUT ->
The first repetitive character in the string 'racecar' is 'c'.
*/