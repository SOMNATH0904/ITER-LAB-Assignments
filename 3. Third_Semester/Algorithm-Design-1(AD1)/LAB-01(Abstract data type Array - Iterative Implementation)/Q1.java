// Ques 1 : Sum of n numbers

import java.util.Scanner;

public class Q1 {

    public static int sum(int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Sum will be : "+sum(n));
    }
}
