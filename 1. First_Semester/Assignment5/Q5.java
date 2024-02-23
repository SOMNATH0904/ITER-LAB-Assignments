package Assignment5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int m = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n = sc.nextInt();

        for( ; m <= n; m++) {
            System.out.println("Multiplication table of "+m+" is ->");
            System.out.println();
            for(int i=1;i<=10;i++) {
                System.out.println(m+" X "+i+" = "+m*i);
            }
            System.out.println();
        }
    }
}