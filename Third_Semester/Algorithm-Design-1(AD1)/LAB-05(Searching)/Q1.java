// Ques 1 : Linear search without recursion

import java.util.Scanner;

public class Q1 {
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int linearSearch(int[] arr, int x ) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			if(arr[i] == x) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {4, 6, 2, 7, 9, 3, 10};
		System.out.print("Array is : ");
		print(arr);
		System.out.println("Enter the element x : ");
		int x = sc.nextInt();
		System.out.println("Element "+x+" is found at Index "+linearSearch(arr, x));
	}

}