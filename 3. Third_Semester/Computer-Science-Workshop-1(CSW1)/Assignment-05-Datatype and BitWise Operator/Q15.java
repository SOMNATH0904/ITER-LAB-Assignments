// Question 15 : Write a program to print the first 100th prime number.

public class Q15 {

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
        int i = 5;
        while(i * i <= n) {
            if(n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        System.out.println("First 100 Prime Numbers:");
        while(count < 100) {
            if(isPrime(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
}
