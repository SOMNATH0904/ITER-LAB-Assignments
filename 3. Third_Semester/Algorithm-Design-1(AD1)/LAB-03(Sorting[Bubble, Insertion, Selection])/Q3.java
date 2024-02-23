// Ques 3 : Selection sort

import java.util.Scanner;

public class Q3 {

    public static void print(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void selection(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            int minIdx = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
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
        System.out.println("Elements present in an array : ");
        print(arr);
        selection(arr);
        System.out.println("Elements after implementing Selection Sort : ");
        print(arr);
    }
}
