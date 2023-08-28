package Assignment6;

import java.util.Scanner;

public class HAQ5 {

    public static boolean areConsecutiveNumbers(int num1, int num2, int num3) {
        return (num1 + 1 == num2 && num2 + 1 == num3) || (num1 - 1 == num2 && num2 - 1 == num3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Input the third number: ");
        int num3 = sc.nextInt();
        sc.close();
        boolean areConsecutive = areConsecutiveNumbers(num1, num2, num3);
        System.out.println("Check whether the three said numbers are consecutive or not! " + areConsecutive);
    }
}

