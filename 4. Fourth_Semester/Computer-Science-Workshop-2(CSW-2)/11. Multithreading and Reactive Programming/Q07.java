/**
 * Ques 7 : Implement a Java program that demonstrates the use of CompletableFuture to perform
asynchronous tasks and handle their results. Create CompletableFuture instances to perform tasks
such as fetching data from a remote server or processing a large file asynchronously. Use
thenApply() or thenCombine() to combine the results.
 */

import java.util.concurrent.CompletableFuture;

public class Q07 {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            return fetchDataFromServer();
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            return processLargeFile();
        });

        CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (result1, result2) -> {
            return result1 + ", " + result2;
        });

        combinedFuture.thenAccept(result -> System.out.println("Combined Result: " + result));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String fetchDataFromServer() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Data from Server 1";
    }

    public static String processLargeFile() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Data from File 1";
    }
}

/**
 * OUTPUT
 *
 * Combined Result: Data from Server 1, Data from File 1
 */