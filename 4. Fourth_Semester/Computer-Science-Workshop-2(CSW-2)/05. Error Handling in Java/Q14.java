import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of x in radians : ");
            double x = sc.nextDouble();
            double result = calculateExpressionValue(x);
            System.out.println("Result of the expression : "+result);
        } catch(Exception e) {
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

        double sinCosSum = sinX + cosX;
        double absSinCosSum = Math.abs(sinCosSum);

        if(Math.abs(tanX - cotX) < 1e-10) {
            throw new ArithmeticException("Division by zero is not allowed!! tan(x) - cot(x) is close to zero!");
        }

        if(sinCosSum < 0) {
            throw new ArithmeticException("Negative value inside logarithmic function!! Invalid input for x!");
        }

        double expressionValue = Math.log(absSinCosSum) / (tanX - cotX);
        return expressionValue;
    }
}

/**
 * OUTPUT
 * Enter the value of x in radians :
 * 34
 * An error occurred : Negative value inside logarithmic function!! Invalid input for x!
 */