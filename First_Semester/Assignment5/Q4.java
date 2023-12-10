package Assignment5;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int m = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n = sc.nextInt();
        for( ; m <= n; m++) {
            int a = 1;
            for(int i = 1; i <= m; i++) {
                a = a*i;
            }
            System.out.println("Factorial of "+m+" is: "+a);
        }
    }
}