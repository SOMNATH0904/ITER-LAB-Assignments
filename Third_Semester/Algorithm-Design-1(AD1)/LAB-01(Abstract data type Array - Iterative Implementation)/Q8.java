// Ques 8 : Generating nth fibonacci number 

import java.util.Scanner;

public class Q8 {

    public static void fibonacci(int num) {
        int a = 0;
        int b = 1;
        System.out.println(a+" "+b+" ");
        int c;
        for(int i = 1; i <= num; i++) {
            c = a+b;
            System.out.println(c+" ");
            a = b;
            b = c;
        }
    }

    public static int fibo(int n) {
        int a = 0;
        int b = 1;
        int c;
        if(n == 0) return a;
        for(int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Fibonacci of "+n+" is  : "+fibo(n));
    }
}
