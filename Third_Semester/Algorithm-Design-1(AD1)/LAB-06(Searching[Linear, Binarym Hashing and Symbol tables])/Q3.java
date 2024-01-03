// Ques 3 : Find the missing number in an array

public class Q3 {
	
	public static int missing(int[] arr) {
		int n = arr.length;
		int num = n+1;
		int totalSum = num*(num+1)/2;
		int sum = 0;
		int missing = 0;
		for(int i = 0; i < n; i++) {
			sum += arr[i];
			missing = totalSum - sum;
		}
		return missing;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 5, 4, 3, 2, 7, 8 , 9};
		System.out.println("Missing Number present in an array is : "+missing(arr));
	}
}