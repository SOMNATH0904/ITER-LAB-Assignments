// Ques 4 : Generating nth fibonacci number

import java.util.Scanner;

public class Q4 {

    public static int fibo(int n) {
        if(n == 0 || n == 1) return n;
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Fibonacci of "+n+" is  : "+fibo(n));
    }
}
