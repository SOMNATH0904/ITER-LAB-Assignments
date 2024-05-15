/**
 * Ques 7 : Write a program that calculates factorial using a recursive lambda expression. Define a recursive lambda expression to calculate factorial. Use the lambda expression to calculate factorial of a given number.
 */

/**
 * CODE
 */

interface FactorialCalculator {
    int calculate(int n);
}

public class Q07 {
    public static void main(String[] args) {
        FactorialCalculator factorialCalculator = calculateFactorial();
        
        int number = 5;
        int factorial = factorialCalculator.calculate(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    private static FactorialCalculator calculateFactorial() {
        FactorialCalculator finalFactorialCalculator = n -> {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * calculateFactorial().calculate(n - 1);
            }
        };
        return finalFactorialCalculator;
    }
}


/**
 * OUTPUT
 * 
 * Factorial of 5 is: 120
 */