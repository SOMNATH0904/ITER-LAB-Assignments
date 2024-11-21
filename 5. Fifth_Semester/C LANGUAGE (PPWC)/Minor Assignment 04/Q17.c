#include <stdio.h>
#include <ctype.h>

int main() {
    char *argv[] = {"mine", "cs", "scs", "oa", NULL};

    for (int i = 0; argv[i] != NULL; i++) {
        for (int j = 0; argv[i][j] != '\0'; j++) {
            argv[i][j] = toupper(argv[i][j]);
        }
        printf("%s\n", argv[i]);
    }

    return 0;
}
