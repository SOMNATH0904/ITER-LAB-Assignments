// Question 16 : Write a Java program to print the prime number in a range.

import java.util.Scanner;

public class Q16 {

    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        if(n <= 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        int i = 5;
        while(i * i <= n) {
            if(n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

    public static void printPrimesInRange(int st, int ed) {
        System.out.println("Prime numbers between " + st + " and " + ed + ":");
        for(int i = st; i <= ed; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();
        printPrimesInRange(start, end);
    }
}
