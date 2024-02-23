// Ques 2 : Linear search using recursion

import java.util.Scanner;

public class Q2 {
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int linearSearchR(int[] arr, int x, int n) {
		if(n == 0) return -1;
		if(x == arr[n-1]) return n-1;
		return linearSearchR(arr, x, n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {4, 6, 2, 7, 9, 3, 10};
		System.out.print("Array is : ");
		print(arr);
		System.out.println("Enter the element x : ");
		int x = sc.nextInt();
		System.out.println("Element "+x+" is found at Index "+linearSearchR(arr, x, arr.length));
	}

}