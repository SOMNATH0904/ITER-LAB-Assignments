import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of x in radians : ");
            double x = sc.nextDouble();
            double result = calculateFunctionValue(x);
            System.out.println("Result of log(sin(x) + cos(x)) / (tan(x) - cot(x)) : "+result);
        } catch (Exception e) {
            System.err.println("An error occurred : "+e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static double calculateFunctionValue(double x) {
        double sinX = Math.sin(x);
        double cosX = Math.cos(x);
        double tanX = Math.tan(x);
        double cotX = 1.0 / tanX;
        double numerator = Math.log(sinX + cosX);
        double denominator = tanX - cotX;
        if(denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed!! x is close to a multiple of π !");
        }
        return numerator / denominator;
    }
}

/**
 * OUTPUT
 * Enter the value of x in radians :
 * 45
 * Result of log(sin(x) + cos(x)) / (tan(x) - cot(x)) : 0.3185782553383016
 */