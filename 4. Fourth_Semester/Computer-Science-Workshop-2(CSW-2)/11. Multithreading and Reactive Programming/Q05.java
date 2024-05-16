/**
 * Ques 5 : Implement a program that demonstrates the use of locks (e.g., ReentrantLock) for thread
synchronization. Create a scenario where multiple threads access a shared resource, and use locks to
ensure that only one thread can access the resource at a time.
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Q05 {
    private static int resource = 0;
    private static Lock lock = new ReentrantLock();

    public static void increment() {
        lock.lock();
        try {
            resource++;
            System.out.println("Incremented resource: " + resource);
        } finally {
            lock.unlock();
        }
    }

    public void decrement() {
        lock.lock();
        try {
            resource--;
            System.out.println("Decremented resource: " + resource);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Q05 sharedResource = new Q05();

        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                Q05.increment();
                try {
                    Thread.sleep(100); // Simulating some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread decrementThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.decrement();
                try {
                    Thread.sleep(100); // Simulating some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        incrementThread.start();
        decrementThread.start();

        try {
            incrementThread.join();
            decrementThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/**
 * OUTPUT
 *
 * Incremented resource: 1
 * Decremented resource: 0
 * Decremented resource: -1
 * Incremented resource: 0
 * Decremented resource: -1
 * Incremented resource: 0
 * Decremented resource: -1
 * Incremented resource: 0
 * Decremented resource: -1
 * Incremented resource: 0
 */