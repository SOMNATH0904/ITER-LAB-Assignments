/**
 * Ques 3 : Write a program that demonstrates lazy evaluation by creating a lazy sequence of prime numbers. Define a lazy sequence using lambda expressions that generates prime numbers. Demonstrate lazy evaluation by printing the first few prime numbers from the lazy sequence.
 */

/**
 * CODE
 */

import java.util.function.Supplier;
import java.util.stream.Stream;

interface LazySequence<T> extends Supplier<T> {
    default LazySequence<T> tail() {
        return (LazySequence<T>) get();
    }

    default boolean isEmpty() {
        return false;
    }
}

public class Q03 {
    public static void main(String[] args) {
        LazySequence<Integer> primes = primes(); 
        System.out.println("First 10 prime numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print(primes.get() + " ");
            primes = primes.tail();
        }
    }
    private static LazySequence<Integer> primes() {
        return new LazySequence<Integer>() {
            @Override
            public Integer get() {
                return Stream.iterate(2, n -> n + 1)
                        .filter(Q03::isPrime)
                        .findFirst()
                        .orElseThrow();
            }

            @Override
            public LazySequence<Integer> tail() {
                return primes(get() + 1);
            }
        };
    }

    private static LazySequence<Integer> primes(int start) {
        return new LazySequence<Integer>() {
            @Override
            public Integer get() {
                return Stream.iterate(start, n -> n + 1)
                        .filter(Q03::isPrime)
                        .findFirst()
                        .orElseThrow();
            }

            @Override
            public LazySequence<Integer> tail() {
                return primes(get() + 1);
            }
        };
    }
    
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}

/**
 * OUTPUT
 * 
 * First 10 prime numbers:
 * 2 3 5 7 11 13 17 19 23 29 
 */