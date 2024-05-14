/**
 * Ques 1 : Create a functional interface Calculator with methods for addition, subtraction, multiplication, and division. Implement these methods using lambda expressions. Define the Calculator functional interface with methods for arithmetic operations. Implement the interface methods using lambda expressions for basic arithmetic operations.
 */

/**
 * CODE
 */

interface Calculator {
    double operate(double a, double b);
}

public class Q01 {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;

        System.out.println("Addition: " + addition.operate(10, 5));
        System.out.println("Subtraction: " + subtraction.operate(10, 5));
        System.out.println("Multiplication: " + multiplication.operate(10, 5));
        System.out.println("Division: " + division.operate(10, 5));
    }
}

/**
 * OUTPUT
 * 
 * Addition: 15.0
 * Subtraction: 5.0
 * Multiplication: 50.0
 * Division: 2.0
 */