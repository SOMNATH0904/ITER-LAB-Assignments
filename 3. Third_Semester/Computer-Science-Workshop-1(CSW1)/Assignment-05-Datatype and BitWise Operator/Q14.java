// Question 14 : Write a Java program to check whether a number is prime or not.

import java.util.Scanner;

public class Q14 {

    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        if(n <= 3) {
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for(int i = 5; i <= sqrt; i += 6) {
            if(n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int n = sc.nextInt();
        boolean result = isPrime(n);
        if(result) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
