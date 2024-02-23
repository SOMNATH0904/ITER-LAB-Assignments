// Ques 3 : Rotating array by k steps

import java.util.Scanner;

public class Q3 {

    public static void print(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int i, int j) {
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K steps : ");
        int K = sc.nextInt();
        System.out.println("Array after Rotating "+K+" steps is : ");
        rotate(arr, K);
        print(arr);
    }
}