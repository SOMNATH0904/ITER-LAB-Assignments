// Ques 4 : Finding the largest sum contiguous subarray(Kadane's Algorithm) 

import java.util.Scanner;

public class Q4 {

    public static void kadane(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0) currSum = 0;
        }
        System.out.println(maxSum);
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
        System.out.println("The Largest Sum Contiguous Subarray is : ");
        kadane(arr);
    }
}
