#include <stdio.h>
#include <string.h>

typedef struct {
    int xx, yy, zz, mm;
    char nickname[11];
} address_t;

int local_address(address_t a, address_t b) {
    return (a.xx == b.xx && a.yy == b.yy);
}

void scan_address(address_t *addr) {
    scanf("%d.%d.%d.%d %s", &addr->xx, &addr->yy, &addr->zz, &addr->mm, addr->nickname);
}

void print_address(address_t addr) {
    printf("%d.%d.%d.%d %s\n", addr.xx, addr.yy, addr.zz, addr.mm, addr.nickname);
}

int main() {
    address_t addresses[100];
    int count = 0;

    printf("Enter addresses and nicknames (end with '0.0.0.0 none'):\n");

    while (1) {
        scan_address(&addresses[count]);
        if (addresses[count].xx == 0 && addresses[count].yy == 0 && 
            addresses[count].zz == 0 && addresses[count].mm == 0 && 
            strcmp(addresses[count].nickname, "none") == 0) {
            break;
        }
        count++;
    }

    printf("\nMatching Local Networks:\n");
    for (int i = 0; i < count; i++) {
        for (int j = i + 1; j < count; j++) {
            if (local_address(addresses[i], addresses[j])) {
                printf("Machines %s and %s are on the same local network.\n", 
                       addresses[i].nickname, addresses[j].nickname);
            }
        }
    }

    printf("\nFull List of Addresses and Nicknames:\n");
    for (int i = 0; i < count; i++) {
        print_address(addresses[i]);
    }

    return 0;
}
