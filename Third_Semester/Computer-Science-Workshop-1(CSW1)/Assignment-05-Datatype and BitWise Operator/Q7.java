// Question 7 : Write a program to find x to the power y.

public class Q7 {

    public static long power(int x, int y) {
        long result = 1;
        long base = x;
        while(y > 0) {
            if((y & 1) == 1) {
                result *= base;
            }
            base *= base;
            y >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 10;
        System.out.println(x+" raised to the power "+y+" is: "+power(x, y));
    }
}
