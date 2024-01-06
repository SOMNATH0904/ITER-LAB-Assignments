// Question 6 : Write a java program to compute x/y without arithmetic operators.

public class Q6 {

    public static int divide(int x, int y) {
        if (y == 0 || (x == Integer.MIN_VALUE && y == -1)) {
            return Integer.MAX_VALUE;
        }
        boolean isNegative = (x<0) ^ (y<0);
        long dividend = Math.abs((long)x);
        long divisor = Math.abs((long)y);
        int result = 0;
        while (dividend >= divisor) {
            long temp = divisor;
            int quotient = 1;
            while(dividend >= (temp << 1)) {
                temp <<= 1;
                quotient <<= 1;
            }
            dividend -= temp;
            result += quotient;
        }
        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 3;
        System.out.println("Division of " + x + " by " + y + " is: " + divide(x, y));
    }
}
