// Question 12 : Write a program that reads an integer number as a sting and converts it to an int base type.

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number as a string: ");
        String intString = sc.nextLine();
        int intValue = Integer.parseInt(intString);
        System.out.println("Converted integer value: " + intValue);
    }
}
