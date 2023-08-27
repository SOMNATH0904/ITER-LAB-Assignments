package Assignment5;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Prime numbers between "+a+" and "+b+" are : ");
        for( ; a <= b; a++) {
            int flag = 0;
            int count = 2;
            while(count <= a/2) {
                if(a%count == 0) {
                    flag = 1;
                }
                count++;
            }
            if(flag == 0) {
                System.out.print(a+" ");
            }
        }
    }
}