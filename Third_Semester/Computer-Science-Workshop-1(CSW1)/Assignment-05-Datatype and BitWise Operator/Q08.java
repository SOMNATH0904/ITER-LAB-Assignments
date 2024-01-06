// Question 8 : Write a program to find the reverse of a number. For example, if the input is
//123 output is 321, and if the input is -245 output is -542.

public class Q08 {

    public static int reverse(int n) {
        int rev = 0;
        while(n != 0) {
            int digit = n % 10;
            n /= 10;
            if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            rev = (rev * 10) + digit;
        }
        return rev;
    }

    public static void main(String[] args) {
        int n1 = 123;
        int n2 = -245;
        System.out.println("Reverse of "+n1+" is: "+reverse(n1));
        System.out.println("Reverse of "+n2+" is: "+reverse(n2));
    }
}
