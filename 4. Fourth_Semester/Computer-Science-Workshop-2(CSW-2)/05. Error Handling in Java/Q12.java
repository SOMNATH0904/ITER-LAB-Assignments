import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of x in radians : ");
            double x = sc.nextDouble();
            double result = calculateExpressionValue(x);
            System.out.println("Result of expression : "+result);
        } catch (Exception e) {
            System.err.println("An error occurred : "+e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static double calculateExpressionValue(double x) {
        double sinX = Math.sin(x);
        double cosX = Math.cos(x);
        double tanX = Math.tan(x);
        double cotX = 1 / tanX;
        if (Math.abs(tanX + 1) < 1e-10) {
            throw new ArithmeticException("Division by zero is not allowed. x is close to π/2 or -π/2.");
        }
        double sinCosProduct = sinX * cosX;
        if (sinCosProduct < 0) {
            throw new ArithmeticException("Negative value inside square root. Invalid input for x.");
        }
        double expressionValue = Math.sqrt(Math.abs(sinCosProduct)) / (tanX + 1);
        return expressionValue;
    }
}

/**
 * OUTPUT
 * Enter the value of x in radians :
 * -87
 * Result of expression : 0.2801626120149333
 */