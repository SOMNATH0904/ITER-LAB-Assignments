/**
 * Ques 8 : Write a program that creates a thread using a lambda expression as the Runnable and prints "Hello, CSW2!" from the thread. Define a lambda expression that implements the Runnable interface and prints "Hello, CSW2!". Create a thread using the lambda expression and start the thread.
 */

/**
 * CODE
 */

public class Q08 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Hello, CSW2!"));
        thread.start();
    }
}

/**
 * OUTPUT
 * 
 * Hello, CSW2!
 */