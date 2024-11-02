#include <stdio.h>

int leap(int year) {
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return 1;
            }
            return 0;
        }
        return 1;
    }
    return 0;
}

int dayOfYear(int month, int day, int year) {
    int daysInMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int dayNumber = day;

    if (leap(year)) {
        daysInMonth[2] = 29;
    }

    for (int i = 1; i < month; i++) {
        dayNumber += daysInMonth[i];
    }

    return dayNumber;
}

int main() {
    int month, day, year;

    printf("Enter month (1-12): ");
    scanf("%d", &month);
    printf("Enter day (1-31): ");
    scanf("%d", &day);
    printf("Enter year: ");
    scanf("%d", &year);

    int dayNumber = dayOfYear(month, day, year);
    printf("The day number for %02d/%02d/%d is: %d\n", month, day, year, dayNumber);

    return 0;
}
