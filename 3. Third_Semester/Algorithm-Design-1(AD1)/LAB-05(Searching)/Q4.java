// Ques 4 : Binary search without recursion

import java.util.Scanner;

public class Q4 {
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int binarySearchR(int[] arr, int x, int st, int end) {
		while(st <= end) {
			int mid = (st+end)/2;
			if(arr[mid] == x) return mid;
			else if(arr[mid] > x) return binarySearchR(arr, x, st, mid-1);
			else return binarySearchR(arr, x, mid+1, end);
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
		System.out.println("Element "+x+" is found at Index "+binarySearchR(arr, x, 0, arr.length-1));
	}

}