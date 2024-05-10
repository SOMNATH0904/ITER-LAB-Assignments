/**
 * Ques 1 : Write a Java Program to implement Merge Sort.
 */

/**
 * ALGORITHM
 
   MergeSort(array)
    if length of array <= 1
        return array
    else
        mid = length of array / 2
        left_half = MergeSort(first half of array)
        right_half = MergeSort(second half of array)
        return Merge(left_half, right_half)

   Merge(left, right)
    merged_array = []
    while left is not empty and right is not empty
        if first element of left <= first element of right
            append first element of left to merged_array
            remove first element of left
        else
            append first element of right to merged_array
            remove first element of right
    append remaining elements of left to merged_array
    append remaining elements of right to merged_array
    return merged_array

 */

/**
 * CODE
 */

public class Q1_MergeSort {
    private void merge(int[] arr, int[] temparr, int lowerIndex, int middleIndex, int upperIndex) {
        int lowerStart = lowerIndex;
        int lowerStop = middleIndex;
        int upperStart = middleIndex + 1;
        int upperStop = upperIndex;
        int count = lowerIndex;
        while (lowerStart <= lowerStop && upperStart <= upperStop) {
            if (arr[lowerStart] < arr[upperStart]) {
                temparr[count++] = arr[lowerStart++];
            } else {
                temparr[count++] = arr[upperStart++];
            }
        }
        while (lowerStart <= lowerStop) {
            temparr[count++] = arr[lowerStart++];
        }
        while (upperStart <= upperStop) {
            temparr[count++] = arr[upperStart++];
        }
        for (int i = lowerIndex; i <= upperIndex; i++) {
            arr[i] = temparr[i];
        }
    }

    private void mergeSrt(int[] arr, int[] temparr, int lowerIndex, int upperIndex) {
        if (lowerIndex >= upperIndex) {
            return;
        }
        int middleIndex = (lowerIndex + upperIndex) / 2;
        mergeSrt(arr, temparr, lowerIndex, middleIndex);
        mergeSrt(arr, temparr, middleIndex + 1, upperIndex);
        merge(arr, temparr, lowerIndex, middleIndex, upperIndex);
    }

    public void sort(int[] arr) {
        int size = arr.length;
        int[] temparr = new int[size];
        mergeSrt(arr, temparr, 0, size - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 1, 6, 5, 7, 8 };
        System.out.println("Array arr is : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After Implementing Merge Sort Array arr will be : ");
        Q1_MergeSort m = new Q1_MergeSort();
        m.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/**
 * OUTPUT
 * 
 * Array arr is : 
 * 3 4 2 1 6 5 7 8 
 * After Implementing Merge Sort Array arr will be : 
 * 1 2 3 4 5 6 7 8 
 */