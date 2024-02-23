// Question 11 : Write a Java program that reads an integer number and counts the number of digits that are even.

import java.util.Scanner;

public class Q11 {

    public static int countEvenDigits(int n) {
        int count = 0;
        while(n != 0) {
            int digit = n % 10;
            if((digit & 1) == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();
        int evenCount = countEvenDigits(n);
        System.out.println("Number of even digits: "+evenCount);
    }
}
