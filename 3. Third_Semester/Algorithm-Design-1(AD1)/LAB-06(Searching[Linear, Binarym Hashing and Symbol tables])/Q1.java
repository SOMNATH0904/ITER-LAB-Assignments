// Ques 1 : Finding first repeated elements in an array

public class Q1 {

	public static int firstRepeated(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n-1; j++) {
				if(arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 5, 3, 9, 30};
		System.out.println(firstRepeated(arr));
	}
}