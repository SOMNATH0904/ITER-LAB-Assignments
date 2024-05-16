/**
 * Ques 4 : Implement a program where two threads communicate with each other using wait() and
notify() methods. One thread should print even numbers, and the other should print odd numbers in
sequence.
 */

public class Q04 {
    public static void main(String[] args) {
        final Object lock = new Object();
        System.out.println("Even and Odd Prime Numbers are : ");
        Thread evenThread = new Thread(() -> {
            synchronized (lock) {
                for (int i = 2; i <= 10; i += 2) {
                    System.out.print(i+" ");
                    lock.notify();
                    try {
                        if (i < 10) lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread oddThread = new Thread(() -> {
            synchronized (lock) {
                for (int i = 1; i <= 9; i += 2) {
                    System.out.print(i+" ");
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        evenThread.start();
        oddThread.start();
    }
}

/**
 * OUTPUT
 *
 * Even and Odd Prime Numbers are :
 * 2 1 4 3 6 5 8 7 10 9
 */