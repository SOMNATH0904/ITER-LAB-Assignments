package HomeAssignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Number : ");
        int c = sc.nextInt();
        if((a + b == c) && (a == b - c) && (a * b == c)){
            System.out.println(a+", "+b+", "+c+" can be used in a Correct Arithmetic Formula");
        }
        else{
            System.out.println(a+", "+b+", "+c+" cannot be used in a Correct Arithmetic Formula");
        }
    }
}