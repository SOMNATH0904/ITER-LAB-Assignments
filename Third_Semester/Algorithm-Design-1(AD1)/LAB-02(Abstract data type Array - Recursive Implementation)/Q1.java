// Ques 1 : Sum of n numbers

import java.util.Scanner;

public class Q1 {

    public static int sumNnumbers(int n) {
        if(n == 0) return 0;
        return n + sumNnumbers(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Sum will be : "+sumNnumbers(n));
    }
}
