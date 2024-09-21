/*
Ques 6: You are tasked with creating a C program to convert a given distance (in meters) to various other units
commonly used in science. Your program should prompt the user for a distance in meters and then
display a table that converts this distance into Kilometers, Centimeters, Millimeters, Feet, and Inches.
The program must satisfy the following requirements.
(a) Prompt the user to enter a distance in meters (floating-point number).
(b) Perform the necessary conversions using the following relationships:
• 1 meter = 0.001 kilometers
• 1 meter = 100 centimeters
• 1 meter = 1000 millimeters
• 1 meter = 3.28084 feet
• 1 meter = 39.3701 inches
(c) Display the conversions in a neatly aligned table using printf with appropriate format specifiers
as follows.
Enter distance in meters: 12.5
+------------------+------------------+
| Unit             | Value            |
+------------------+------------------+
| Meters           | 12.50            |
| Kilometers       | 0.01             |
| Centimeters      | 1250.00          |
| Millimeters      | 12500.00         |
| Feet             | 41.01            |
| Inches           | 492.13           |
+------------------+------------------+
*/

#include <stdio.h>

int main() {
    float meters, kilometers, centimeters, millimeters, feet, inches;
    printf("Enter distance in meters: ");
    scanf("%f", &meters);

    kilometers = meters * 0.001;
    centimeters = meters * 100;
    millimeters = meters * 1000;
    feet = meters * 3.28084;
    inches = meters * 39.3701;

    printf("+------------------+------------------+\n");
    printf("| Unit             | Value            |\n");
    printf("+------------------+------------------+\n");
    printf("| Meters           | %.2f             |\n", meters);
    printf("| Kilometers       | %.5f              |\n", kilometers);
    printf("| Centimeters      | %.2f              |\n", centimeters);
    printf("| Millimeters      | %.2f              |\n", millimeters);
    printf("| Feet             | %.2f              |\n", feet);
    printf("| Inches           | %.2f              |\n", inches);
    printf("+------------------+------------------+\n");

    return 0;
}


/*
Output ->
Enter distance in meters: 200
+------------------+------------------+
| Unit             | Value            |
+------------------+------------------+
| Meters           | 200.00             |
| Kilometers       | 0.20000              |
| Centimeters      | 20000.00              |
| Millimeters      | 200000.00              |
| Feet             | 656.17              |
| Inches           | 7874.02              |
+------------------+------------------+
*/
