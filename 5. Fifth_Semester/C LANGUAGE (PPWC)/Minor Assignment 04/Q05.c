#include <stdio.h>

int main() {
    int values[3] = {12, 25, 18}; 
    int *ptr = values;
    
    for (int i = 0; i < 3; i++) {
        *(ptr + i) += 10;        
    }

    printf("Updated values:\n a: %d\n b: %d\n c: %d\n", values[0], values[1], values[2]);
    return 0;
}
