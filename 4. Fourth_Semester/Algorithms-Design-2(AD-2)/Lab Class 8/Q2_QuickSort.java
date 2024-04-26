/**
 * Ques 2 : Write a Java Program to implement Quick Sort. 
 */

/**
 * ALGORITHM
 * 
 * 
 */

/**
 * CODE
 */

public class Q2_QuickSort {
    private void quickSort(int arr[], int lower, int upper) {
        if (upper <= lower)
            return;
        int pivot = arr[lower];
        int start = lower;
        int stop = upper;

        while (lower < upper) {
            while (arr[lower] <= pivot && lower < upper) {
                lower++;
            }
            while (arr[upper] > pivot && lower <= upper) {
                upper--;
            }
            if (lower < upper) {
                swap(arr, upper, lower);
            }
        }
        swap(arr, upper, start); // upper is the pivot position
        quickSort(arr, start, upper - 1); // pivot -1 is the upper for left sub arr.
        quickSort(arr, upper + 1, stop); // pivot + 1 is the lower for right sub arr
    }

    public void sort(int[] arr) {
        int size = arr.length;
        quickSort(arr, 0, size - 1);
    }

    private void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 1, 6, 5, 7, 8, 10, 9 };
        System.out.println("Array arr is : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Q2_QuickSort srt = new Q2_QuickSort();
        System.out.println("After Implementing Quick Sort Array arr will be : ");
        srt.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/**
 * OUTPUT
 * 
 * Array arr is : 
 * 3 4 2 1 6 5 7 8 10 9 
 * After Implementing Quick Sort Array arr will be : 
 * 1 2 3 4 5 6 7 8 9 10 
 */