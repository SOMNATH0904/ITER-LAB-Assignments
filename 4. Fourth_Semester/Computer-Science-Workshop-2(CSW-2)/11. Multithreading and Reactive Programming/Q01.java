/**
 * Ques 1 : Write a Java program to create a simple calculator that performs arithmetic operations
(addition, subtraction, multiplication, division) using multiple threads. Each arithmetic operation
should be handled by a separate thread.
 */

public class Q01 {
    public static void main(String[] args) {
        Thread additionThread = new Thread(() -> {
            int result = 5 + 3;
            System.out.println("Addition Result: " + result);
        });
        Thread subtractionThread = new Thread(() -> {
            int result = 5 - 3;
            System.out.println("Subtraction Result: " + result);
        });
        Thread multiplicationThread = new Thread(() -> {
            int result = 5 * 3;
            System.out.println("Multiplication Result: " + result);
        });
        Thread divisionThread = new Thread(() -> {
            int result = 6 / 3;
            System.out.println("Division Result: " + result);
        });

        additionThread.start();
        subtractionThread.start();
        multiplicationThread.start();
        divisionThread.start();
    }
}

/**
 * OUTPUT
 *
 * Addition Result: 8
 * Multiplication Result: 15
 * Subtraction Result: 2
 * Division Result: 2
 */