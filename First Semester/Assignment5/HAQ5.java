package Assignment5;

import java.util.Scanner;

public class HAQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto you wat the series : ");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series is : "+a+","+b);
        for(int i = 2; i <= n; i++) {
            c = a+b;
            System.out.println(", "+c);
            a = b;
            b = c;
        }
    }
}
