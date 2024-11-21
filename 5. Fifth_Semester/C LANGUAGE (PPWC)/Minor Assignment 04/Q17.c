#include <stdio.h>
#include <ctype.h>

int main() {
    char str1[] = "mine";
    char str2[] = "cs";
    char str3[] = "sc";
    char str4[] = "soa";

    char *argv[] = {str1, str2, str3, str4, NULL};

    for (char **ptr = argv; *ptr != NULL; ptr++) {
        for (char *ch = *ptr; *ch != '\0'; ch++) {
            *ch = toupper(*ch); 
        }
    }

    for (char **ptr = argv; *ptr != NULL; ptr++) {
        printf("%s\n", *ptr);
    }

    return 0;
}
