/**
 * Ques 11 : Given an unsorted array of integers from 1 to 10, find smallest positive number missing in the array. Use a hash map HashMap<Integer, Integer> to keep track of elements.
 */

import java.util.HashMap;

public class Q11 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

        int smallestMissingNumber = SmallestMissingNumber(array);
        System.out.println("Smallest positive missing number: " + smallestMissingNumber);
    }
    public static int SmallestMissingNumber(int[] array) {
        HashMap<Integer, Integer> numCountMap = new HashMap<>();
        for (int num : array) {
            numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
        }
        for (int i = 1; i <= 10; i++) {
            if (!numCountMap.containsKey(i)) {
                return i;
            }
        }
        return 11;
    }
}

/**
 * OUTPUT :
 *
 * Smallest positive missing number: 11
 */