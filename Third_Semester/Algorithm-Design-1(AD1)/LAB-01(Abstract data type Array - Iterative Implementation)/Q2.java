// Ques 2 : Finding maximum and minimum

import java.util.Scanner;

public class Q2 {

    public static int maximum(int[] arr) {
        int greatest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > greatest) {
                greatest = arr[i];
            }
        }
        return greatest;
    }

    public static int minimum(int [] arr) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
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
        System.out.println("The Sum will be : "+maximum(arr));
    }
}
