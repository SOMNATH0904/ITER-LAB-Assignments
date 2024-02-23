// Question 8 : Write a program to read a boolean as a string and convert it to a Boolean object.

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a boolean as a string (true or false): ");
        String inputString = sc.nextLine();
        if(inputString.equalsIgnoreCase("true") || inputString.equalsIgnoreCase("false")) {
            Boolean booleanObject = Boolean.valueOf(inputString);
            System.out.println("Boolean Object: "+booleanObject);
        } else {
            System.out.println("Invalid input. Please enter 'true' or 'false'.");
        }
    }
}
