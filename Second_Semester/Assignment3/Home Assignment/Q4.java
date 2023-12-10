package HomeAssignment;

import java.util.Scanner;

public class Q4 {

    public static void rearrangeArray(int[] arr, int k, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivotIndex = partition(arr, k, start, end);

        rearrangeArray(arr, k, start, pivotIndex - 1);
        rearrangeArray(arr, k, pivotIndex + 1, end);
    }

    public static int partition(int[] arr, int k, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= k) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, end);

        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of elements in an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value of k : ");
        int k = sc.nextInt();
        rearrangeArray(arr, k, 0, arr.length-1);
        System.out.println("Rearrangement of Array is : ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}