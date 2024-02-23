// Question 13 : Write a Java program to count the frequency of each digit of a number.

import java.util.Scanner;

public class Q13 {

    public static void countDigitFrequency(int n) {
        int[] freq = new int[10];
        while(n != 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }
        for(int i = 0; i < 10; i++) {
            if(freq[i] > 0) {
                System.out.println("Frequency of digit " + i + ": "+freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();
        countDigitFrequency(n);
    }
}

