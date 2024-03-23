/**
 * Ques 12 : Declare an array of integers. int[] arr = {1,2,10,8,7,3,4,6,5,9};. Then create a min heap of elements from the array using Priority Queue class. Again Dequeue elements of Priority Queue using appropriate methods.
 */

import java.util.PriorityQueue;

public class Q12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
        }
        System.out.println("Min heap elements:");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}

/**
 * OUTPUT :
 *
 * Min heap elements:
 * 1 2 3 4 5 6 7 8 9 10
 */