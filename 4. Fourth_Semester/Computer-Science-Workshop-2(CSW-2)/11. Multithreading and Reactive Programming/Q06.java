/**
 * Ques 6 : Write a Java program that generates prime numbers up to a given limit using multiple
threads. Each thread should generate a subset of the prime numbers.
 */

import java.util.ArrayList;
import java.util.List;

public class Q06 {
    static int limit = 100;
    static List<Integer> primes = new ArrayList<>();

    public static void main(String[] args) {
        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            final int threadId = i;
            threads[i] = new Thread(() -> generatePrimes(threadId));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Prime numbers up to " + limit + ": " + primes);
    }

    static void generatePrimes(int threadId) {
        for (int num = threadId + 2; num <= limit; num += 5) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                synchronized (primes) {
                    primes.add(num);
                }
            }
        }
    }
}

/**
 * OUTPUT
 *
 * Prime numbers up to 100: [2, 3, 7, 13, 17, 23, 37, 43, 47, 53, 67, 73, 97, 83, 19, 29, 59, 79, 89, 5, 11, 31, 41, 61, 71]
 */