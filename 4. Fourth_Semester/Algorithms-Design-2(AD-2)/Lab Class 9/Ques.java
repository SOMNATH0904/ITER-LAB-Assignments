/**
 * Ques : Write a Java Program to count the number of inversions in an array using MergeSort. Display the 
 *        pairs of inversions and the number of inversions.
 */

/**
 * ALGORITHM
 * 
mergeSortAndCount(arr, l, r, inversions):
    count = 0
    if l < r:
        mid = (l + r) / 2
        count += mergeSortAndCount(arr, l, mid, inversions)
        count += mergeSortAndCount(arr, mid + 1, r, inversions)
        count += mergeAndCount(arr, l, mid, r, inversions)
    return count

mergeAndCount(arr, l, mid, r, inversions):
    left = copy of arr[l...mid]
    right = copy of arr[mid+1...r]
    i = 0
    j = 0
    k = l
    count = 0
    while i < length(left) AND j < length(right):
        if left[i] <= right[j]:
            arr[k] = left[i]
            i++
        else:
            arr[k] = right[j]
            j++
            count += mid + 1 - (l + i)
            for p = i to length(left):
                add pair (left[p], right[j - 1]) to inversions
    while i < length(left):
        arr[k] = left[i]
        i++
        k++
    while j < length(right):
        arr[k] = right[j]
        j++
        k++
    return count

main:
    arr = [2, 4, 1, 3, 5]
    print "Original Array:", arr
    inversions = empty list
    count = mergeSortAndCount(arr, 0, length(arr) - 1, inversions)
    print "Pairs of Inversions:"
    for pair in inversions:
        print pair
    print "Number of Inversions:", count
 *
 */

/**
 * CODE
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};

        System.out.println("Original Array : "+Arrays.toString(arr));
        List<String> inversions = new ArrayList<>();
        int count = mergeSortAndCount(arr, 0, arr.length - 1, inversions);
        System.out.println("Pairs of Inversions -->");
        for(String pair : inversions) {
            System.out.println(pair);
        }
        System.out.println("Number of Inversions : "+count);
    }

    private static int mergeSortAndCount(int[] arr, int l, int r, List<String> inversions) {
        int count = 0;
        if(l < r) {
            int mid = (l + r) / 2;
            count += mergeSortAndCount(arr, l, mid, inversions);
            count += mergeSortAndCount(arr, mid + 1, r, inversions);
            count += mergeAndCount(arr, l, mid, r, inversions);
        }
        return count;
    }

    private static int mergeAndCount(int[] arr, int l, int mid, int r, List<String> inversions) {
        int[] left = Arrays.copyOfRange(arr, l, mid + 1);
        int[] right = Arrays.copyOfRange(arr, mid + 1, r + 1);

        int i = 0, j = 0, k = l;
        int count = 0;

        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                count += mid + 1 - (l + i);
                for(int p = i; p < left.length; p++) {
                    inversions.add("(" + left[p] + ", " + right[j - 1] + ")");
                }
            }
        }

        while(i < left.length) {
            arr[k++] = left[i++];
        }

        while(j < right.length) {
            arr[k++] = right[j++];
        }

        return count;
    }
}

/**
 * OUTPUT
 * 
 * Original Array : [2, 4, 1, 3, 5]
 * Pairs of Inversions -->
 * (2, 1)
 * (4, 1)
 * (4, 3)
 * Number of Inversions : 3
 */