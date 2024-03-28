import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the dividend: ");
            int dividend = sc.nextInt();

            System.out.println("Enter the divisor: ");
            int divisor = sc.nextInt();

            double result = divide(dividend, divisor);
            System.out.println("Result of division : "+result);
        } catch(ArithmeticException e) {
            System.err.println("ArithmeticException occurred : "+e.getMessage());
        } catch(Exception e) {
            System.err.println("An error occurred : "+e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static double divide(int dividend, int divisor) {
        if(divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) dividend / divisor;
    }
}

/**
 * OUTPUT
 * Enter the dividend:
 * 56
 * Enter the divisor:
 * 2
 * Result of division : 28.0
 */