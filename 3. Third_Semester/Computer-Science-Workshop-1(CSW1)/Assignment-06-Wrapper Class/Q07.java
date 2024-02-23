// Question 7 : Write a program to read a double as a string and convert it to a Double object.

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float as a string: ");
        String inputString = sc.nextLine();
        Float floatObject = Float.valueOf(inputString);
        System.out.println("Float Object: " + floatObject);
    }
}
