#include <stdio.h>

int main() {
    char ch;

    printf("Enter the choice of the character: ");
    scanf(" %c", &ch);

    int n = ch - 'A' + 1;  
    for (int i = 0; i < n; i++) {
        for (char j = 'A'; j < 'A' + n - i; j++) {
            printf("%c ", j);
        }

        for (int j = 0; j < 2 * i; j++) {
            printf("  ");
        }

        for (char j = 'A' + n - i - 1; j >= 'A'; j--) {
            printf("%c ", j);
        }

        printf("\n");
    }

    return 0;
}
