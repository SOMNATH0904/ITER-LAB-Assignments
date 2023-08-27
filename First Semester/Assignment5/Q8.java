package Assignment5;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;

        System.out.println("The Sum of the series is : ");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                sum = sum + j;
                System.out.print(sum + " ");
            }
        }
    }
}