package Assignment4;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base : ");
        int base = sc.nextInt();
        System.out.println("Enter the Power :");
        int power = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;     // result = result * base;
        }
        System.out.println(base + " raised to the power " + power + " is : " + result);
    }
}