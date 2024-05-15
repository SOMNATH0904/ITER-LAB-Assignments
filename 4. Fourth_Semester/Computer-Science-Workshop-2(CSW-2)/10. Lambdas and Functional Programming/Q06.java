/**
 * Ques 6 : Write a program that demonstrates a function returning another function, where the inner function calculates the square of a number. Define a function that returns another function. The inner function should calculate the square of a given number. Demonstrate the use of the returned function to calculate squares.
 */

/**
 * CODE
 */

interface SquaringFunction {
    int square(int x);
}

public class Q06 {
    public static SquaringFunction getSquareFunction() {
        return x -> x * x;
    }

    public static void main(String[] args) {
        SquaringFunction squareFunction = getSquareFunction();

        // Demonstrate the use of the returned function to calculate squares
        System.out.println("Square of 5: " + squareFunction.square(5));
        System.out.println("Square of 8: " + squareFunction.square(8));
        System.out.println("Square of -3: " + squareFunction.square(-3));
    }
}


/**
 * OUTPUT
 * 
 * Square of 5: 25
 * Square of 8: 64
 * Square of -3: 9
 */