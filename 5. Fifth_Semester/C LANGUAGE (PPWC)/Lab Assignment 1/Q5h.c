#include<stdio.h>
int main() {
    printf("%d==%i==%o==%x\n",32,32,32,32);
    printf("%d==%i==%#o==%#x\n",32,32,32,32);
    printf("%d==%i==%#o==%#X\n",32,32,32,32);
    printf("%+d==%+i==%#o==%#X\n",32,32,032,0x45b);
    return 0;
}

/*
Output ->
32==32==40==20
32==32==040==0x20
32==32==040==0X20
+32==+32==032==0X45B
*/