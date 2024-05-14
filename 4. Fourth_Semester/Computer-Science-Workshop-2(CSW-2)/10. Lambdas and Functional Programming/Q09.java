/**
 * Ques 9 : Write a program that implements the producer consumer problem using lambda expressions and threads. Define a bounded buffer class that implements a queue. Create producer and consumer classes that use lambda expressions to produce and consume items from the bounded buffer. Create and start multiple producer and consumer threads to demonstrate the producer consumer problem.
 */

/**
 * CODE
 */

import java.util.LinkedList;
import java.util.Queue;

// Bounded buffer class
class BoundedBuffer<T> {
    private Queue<T> buffer;
    private int capacity;

    public BoundedBuffer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    // Producer method
    public synchronized void produce(T item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); // Wait if buffer is full
        }
        buffer.offer(item);
        notifyAll(); // Notify consumers
    }

    // Consumer method
    public synchronized T consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); // Wait if buffer is empty
        }
        T item = buffer.poll();
        notifyAll(); // Notify producers
        return item;
    }
}

public class Q09 {
    public static void main(String[] args) {
        BoundedBuffer<Integer> buffer = new BoundedBuffer<>(5);
        
        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    buffer.produce(i);
                    System.out.println("Produced: " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer thread
        Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    int item = buffer.consume();
                    System.out.println("Consumed: " + item);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start producer and consumer threads
        producerThread.start();
        consumerThread.start();
    }
}

/**
 * OUTPUT
 * 
Produced: 1
Consumed: 1
Produced: 2
Produced: 3
Consumed: 2
Produced: 4
Consumed: 3
Produced: 5
Produced: 6
Consumed: 4
Produced: 7
Produced: 8
Consumed: 5
Produced: 9
Produced: 10
Consumed: 6
Consumed: 7
Consumed: 8
Consumed: 9
Consumed: 10
 *
 */