#include<stdio.h>
int main() {
    int i=54321;
    float x=876.543;
    printf(":%3d: :%5d: :%10d: :%12d:\n",i,i,i,i);
    printf(":%3f: :%10f: :%13f: :%f:\n",x,x,x,x);
    return 0;
}

/*
Output ->
:54321: :54321: :     54321: :       54321:
:876.543030: :876.543030: :   876.543030: :876.543030:
*/