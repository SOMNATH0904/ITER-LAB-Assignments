/**
 * Ques 7 : Write a program that calculates factorial using a recursive lambda expression. Define a recursive lambda expression to calculate factorial. Use the lambda expression to calculate factorial of a given number.
 */

/**
 * CODE
 */

import java.util.function.Function;

public class Q07 {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = n -> factorial(n);
        
        int number = 5;
        System.out.println("Factorial of " + number + ": " + factorial.apply(number));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}

/**
 * OUTPUT
 * 
 * Factorial of 5: 120
 */