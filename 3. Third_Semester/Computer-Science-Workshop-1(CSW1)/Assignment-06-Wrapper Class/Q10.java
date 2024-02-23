// Question 10 : Write a program to design a simple calculator (only +,-,*,/ operations). The calculator works as follows: Input: ”123+345” Output: Sum=468 ; Input: ”5*10” Output: mul=50

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an expression (+, -, *, /): ");
        String input = sc.nextLine();
        String[] elements = input.split("[+\\-*/]");
        if (elements.length != 2) {
            System.out.println("Invalid input format.");
        } else {
            int num1 = Integer.parseInt(elements[0].trim());
            int num2 = Integer.parseInt(elements[1].trim());

            if (input.contains("+")) {
                int sum = num1 + num2;
                System.out.println("Sum = " + sum);
            } else if (input.contains("-")) {
                int diff = num1 - num2;
                System.out.println("Difference = " + diff);
            } else if (input.contains("*")) {
                int mul = num1 * num2;
                System.out.println("Multiplication = " + mul);
            } else if (input.contains("/")) {
                if (num2 != 0) {
                    double div = (double) num1 / num2;
                    System.out.println("Division = " + div);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
            } else {
                System.out.println("Invalid operator.");
            }
        }
    }
}
