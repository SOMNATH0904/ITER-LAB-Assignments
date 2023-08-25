package Assignment3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number :");
        int a = sc.nextInt();
        System.out.print("enter second number :");
        int b = sc.nextInt();
        System.out.print("enter third number :");
        int c = sc.nextInt();
        if (a <= b && b <= c) {
            System.out.println("Increasing");
        } else if (a >= b && b >= c) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither Increasing nor Decreasing");
        }
    }
}