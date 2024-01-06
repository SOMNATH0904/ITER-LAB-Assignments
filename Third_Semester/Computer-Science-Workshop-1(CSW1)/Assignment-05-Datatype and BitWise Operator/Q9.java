// Question 9 : Write a program to check whether a number is palindrome or not.

public class Q9 {

    public static boolean isPalindrome(int n) {
        if(n < 0 || (n != 0 && n % 10 == 0)) {
            return false;
        }
        int reversed = 0;
        while(n > reversed) {
            reversed = (reversed * 10) + (n % 10);
            n = n / 10;
        }
        return n == reversed || n == reversed / 10;
    }

    public static void main(String[] args) {
        int number1 = 12321;
        int number2 = 12345;
        System.out.println(number1 + " is palindrome: " + isPalindrome(number1));
        System.out.println(number2 + " is palindrome: " + isPalindrome(number2));
    }
}
