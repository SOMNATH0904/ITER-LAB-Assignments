#include <stdio.h>

int main() {
    int marks;
    char grade;

    printf("Enter the marks obtained by the student: ");
    scanf("%d", &marks);

    switch (marks / 10) {
        case 10:
        case 9:
            grade = 'O';
            break;
        case 8:
            grade = 'A';
            break;
        case 7:
            grade = 'B';
            break;
        case 6:
            grade = 'C';
            break;
        case 5:
            grade = 'D';
            break;
        case 4:
            grade = 'E';
            break;
        default:
            grade = 'F';
            break;
    }

    printf("The grade is: %c\n", grade);
    return 0;
}
