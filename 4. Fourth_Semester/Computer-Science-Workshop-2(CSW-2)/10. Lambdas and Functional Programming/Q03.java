/**
 * Ques 3 : Write a program that demonstrates lazy evaluation by creating a lazy sequence of prime numbers. Define a lazy sequence using lambda expressions that generates prime numbers. Demonstrate lazy evaluation by printing the first few prime numbers from the lazy sequence.
 */

/**
 * CODE
 */

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Q03 {
    public static void main(String[] args) {
        Supplier<Stream<Integer>> primes = () ->
            Stream.iterate(2, n -> n + 1)
                    .filter(Q03::isPrime);

        System.out.println("Prime Numbers are : ");
        primes.get().limit(10).forEach(System.out::println);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

/**
 * OUTPUT
 * 
 * Prime Numbers are : 
 * 2
 * 3
 * 5
 * 7
 * 11
 * 13
 * 17
 * 19
 * 23
 * 29
 */