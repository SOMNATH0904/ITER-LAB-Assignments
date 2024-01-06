// Question 12 : Write a Java program that reads two integer number and create a third number by taking the first two digits of the first number and the last two digits of the second number. Example: Input: 45678, 312 Output:4512

import java.util.Scanner;

public class Q12 {

    public static int createNumber(int num1, int num2) {
        int firstTwoDigits = num1 / 100;
        int lastTwoDigits = num2 % 100;
        return (firstTwoDigits << 8) | lastTwoDigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second integer number: ");
        int n2 = sc.nextInt();
        int result = createNumber(n1, n2);
        System.out.println("The third number created is: " + result);
    }
}
