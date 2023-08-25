package Assignment3;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter three numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>=b && a>=c) {
            System.out.println(a+" is the Largest number ");
        }
        else if (b>=a && b>=c) {
            System.out.println(b+" is the Largest number ");
        }
        else {
            System.out.println(c+" is the Largest number ");
        }

        if (a>=b && a<=c || a>=c && a<=b) {
            System.out.println(a+" is the 2nd Largest number");
        }
        else if (b>=c && b<=a || b>=a && b<=c) {
            System.out.println(b+" is the 2nd Largest number");
        }
        else {
            System.out.println(c+" is the 2nd Largest number");
        }
    }
}