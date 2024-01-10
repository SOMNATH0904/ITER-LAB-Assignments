// Question 5 : Write a program to read an integer as a string and convert it to an Integer object.

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer as a string: ");
        String inputString = sc.nextLine();
        Integer integerObject = Integer.valueOf(inputString);
        System.out.println("Integer Object: " + integerObject);
    }
}
