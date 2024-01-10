// Question 11 : Write a program that reads a double number as a sting and converts it to a double base type.

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double number as a string: ");
        String doubleString = sc.nextLine();
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println("Converted double value: "+doubleValue);
    }
}
