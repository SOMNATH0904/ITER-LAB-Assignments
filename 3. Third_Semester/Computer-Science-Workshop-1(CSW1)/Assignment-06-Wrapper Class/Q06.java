// Question 6 : Write a program to read a float as a string and convert it to a Float object.

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float as a string: ");
        String inputString = sc.nextLine();
        Float floatObject = Float.valueOf(inputString);
        System.out.println("Float Object: " + floatObject);
    }
}
