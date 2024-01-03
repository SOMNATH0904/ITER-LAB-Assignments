// Ques 4 : Given an array of integers, find the element pair with minimum/maximum difference

// Pair with Maximum Difference Approach

public class Q4 {

	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void minDiff(int[] arr) {
		int ans = 0;
		int min = Integer.MAX_VALUE;
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				ans = Math.abs(arr[j]-arr[i]);
				if(ans < min) {
					min = ans;
				}
			}
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 6, 17, 23, 10, 20};
		print(arr);
		minDiff(arr);
	}
}



// Pair with Minimum Difference Approach


// public class PairWithMinimumDifference_A2 {
	
// 	public static void print(int[] arr) {
// 		for(int i = 0; i < arr.length; i++) {
// 			System.out.print(arr[i]+" ");
// 		}
// 		System.out.println();
// 	}
	
// 	public static void Insertion(int[] arr) {
// 		int n = arr.length;
// 		for(int i = 1; i < n; i++) {
// 			int key = arr[i];
// 			int j = i-1;
// 			while(j >= 0 && arr[j] > key) {
// 				int temp = arr[j+1];
// 				arr[j+1] = arr[j];
// 				arr[j] = temp;
// 				j--;
// 			}
// 		}
// 	}

// 	public static void main(String[] args) {
// 		// TODO Auto-generated method stub
// 		int[] arr = {1, 6, 4, 19, 17, 20};
// 		int n = arr.length;
// 		print(arr);
// 		int diff = arr[1] - arr[0];
// 		for(int i = 2; i < n; i++) {
// 			if(Math.abs(arr[i] - arr[i-1]) < diff) {
// 				diff = Math.abs(arr[i] - arr[i-1]);
// 			}
// 		}
// 		System.out.println(diff);
// 	}
// }