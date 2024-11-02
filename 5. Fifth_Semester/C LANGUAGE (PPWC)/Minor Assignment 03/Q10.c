#include <stdio.h>
#include <string.h>
#include <math.h>

void binaryToHexadecimal(const char *binary) {
    int decimal = 0;
    int length = strlen(binary);

    for (int i = 0; i < length; i++) {
        if (binary[length - 1 - i] == '1') {
            decimal += pow(2, i);
        }
    }

    char hexadecimal[20];
    int index = 0;

    if (decimal == 0) {
        strcpy(hexadecimal, "0");
    } else {
        while (decimal > 0) {
            int remainder = decimal % 16;
            if (remainder < 10) {
                hexadecimal[index++] = remainder + '0';
            } else {
                hexadecimal[index++] = (remainder - 10) + 'A';
            }
            decimal /= 16;
        }
        hexadecimal[index] = '\0';
    }

    for (int i = 0; i < index / 2; i++) {
        char temp = hexadecimal[i];
        hexadecimal[i] = hexadecimal[index - 1 - i];
        hexadecimal[index - 1 - i] = temp;
    }

    printf("The hexadecimal equivalent is: %s\n", hexadecimal);
}

int main() {
    const char *binary = "101101";
    printf("Binary: %s\n", binary);
    binaryToHexadecimal(binary);
    return 0;
}

/*
OUTPUT ->
Binary: 101101
The hexadecimal equivalent is: 2D
*/