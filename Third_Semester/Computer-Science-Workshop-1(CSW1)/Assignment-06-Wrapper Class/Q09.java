// Question 9 : Write a program that reads to convert int, float, double, and boolean as string types and convert them to respective object types using the valueOf method.

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer as a string: ");
        String intString = sc.nextLine();
        Integer intObject = Integer.valueOf(intString);
        System.out.println("Integer Object: " + intObject);
        System.out.print("Enter a float as a string: ");
        String floatString = sc.nextLine();
        Float floatObject = Float.valueOf(floatString);
        System.out.println("Float Object: " + floatObject);
        System.out.print("Enter a double as a string: ");
        String doubleString = sc.nextLine();
        Double doubleObject = Double.valueOf(doubleString);
        System.out.println("Double Object: " + doubleObject);
        System.out.print("Enter a boolean as a string (true or false): ");
        String booleanString = sc.nextLine();
        if (booleanString.equalsIgnoreCase("true") || booleanString.equalsIgnoreCase("false")) {
            Boolean booleanObject = Boolean.valueOf(booleanString);
            System.out.println("Boolean Object: " + booleanObject);
        } else {
            System.out.println("Invalid input for boolean.");
        }
    }
}
