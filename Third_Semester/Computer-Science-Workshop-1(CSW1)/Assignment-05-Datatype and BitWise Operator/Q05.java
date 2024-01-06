// Question 5 : Write a java program to compute x * y with arithmetic operators.

public class Q05 {

    public static int multiply(int x, int y) {
        int result = 0;
        while(y != 0) {
            if ((y & 1) == 1) {
                result = add(result, x);
            }
            y = y >> 1;
            x = x << 1;
        }
        return result;
    }

    public static int add(int a, int b) {
        while(b != 0) {
            int rem = a & b;
            a = a ^ b;
            b = rem << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.println("Product of " + x + " and " + y + " is: " + multiply(x, y));
    }
}
