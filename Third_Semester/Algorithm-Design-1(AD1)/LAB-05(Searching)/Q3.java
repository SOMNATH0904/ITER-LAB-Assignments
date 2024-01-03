// Ques 3 : Binary search without recursion

import java.util.Scanner;

public class Q3 {
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int binarySearch(int[] arr, int x) {
		int start = 0; 
		int end = arr.length-1;
		while(start <= end) {
			int mid = (start + end)/2;
			if(arr[mid] == x) return mid;
			if(arr[mid] > x)	end = mid-1; 
			else	start = mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 3, 5, 7, 9, 25, 30};
		System.out.print("Array is : ");
		print(arr);
		System.out.println("Enter the element x : ");
		int x = sc.nextInt();
		System.out.println("Element "+x+" is found at Index "+binarySearch(arr, x));
	}

}