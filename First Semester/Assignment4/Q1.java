package Assignment4;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Number : ");
        int c = sc.nextInt();
        for(int i = a; i <= b; i++) {
            System.out.print(i+" ");
            sum = sum+i;
        }
        System.out.println("\nThe Sum of Numbers displayed is : "+sum);
    }
}