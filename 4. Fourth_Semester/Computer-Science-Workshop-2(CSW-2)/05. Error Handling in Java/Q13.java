import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of x in radians : ");
            double x = sc.nextDouble();
            double result = evaluateFunctionValue(x);
            System.out.println("Result of the function : "+result);
        } catch(Exception e) {
            System.err.println("An error occurred : "+e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static double evaluateFunctionValue(double x) {
        double sinX = Math.sin(x);
        double cosX = Math.cos(x);
        double sinPlusCos = sinX + cosX;
        if (Math.abs(sinPlusCos) < 1e-10) {
            throw new ArithmeticException("Division by zero is not allowed!! sin(x) + cos(x) is close to zero!");
        }
        double functionValue = (sinX * cosX) / sinPlusCos;
        return functionValue;
    }
}

/**
 * OUTPUT
 * Enter the value of x in radians :
 * 45
 * Result of the function : 0.32480020713436564
 */