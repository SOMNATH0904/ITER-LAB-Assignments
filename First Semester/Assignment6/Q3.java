package Assignment6;

import java.util.Scanner;

public class Q3 {

    public static int reverse(int number) {
        int rev = 0;
        while(number != 0) {
            int rem = number%10;
            number /= 10;
            rev = rev*10 + rem;
        }
        return rev;
    }

    public static boolean isPalindrome(int number) {
        if(number == reverse(number)) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("Is the Number is a Palindrome : "+isPalindrome(n));
    }
}
