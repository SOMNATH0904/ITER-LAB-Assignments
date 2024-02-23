// Ques 3 : Check reverse

class Q3 {

	static boolean checkReverse(int arr[], int n) { 
		if (n == 1) { 
			return true; 
		}
		int i; 
		for (i = 1; arr[i - 1] < arr[i] && i < n; i++); 
		if (i == n) { 
			return true; 
		}
		int j = i; 
		while (j < n && arr[j] < arr[j - 1]) { 
			if (i > 1 && arr[j] < arr[i - 2]) { 
				return false; 
			} 
			j++; 
		}
		if (j == n) return true; 
		int k = j;
		if (arr[k] < arr[i - 1]) { 
			return false; 
		} 

		while (k > 1 && k < n) { 
			if (arr[k] < arr[k - 1]) { 
				return false; 
			} 
			k++; 
		} 
		return true; 
	} 

	public static void main(String[] args) { 

		int arr[] = {1, 3, 4, 10, 9, 8}; 
		int n = arr.length; 

		if (checkReverse(arr, n)) { 
			System.out.print("True"); 
		} else { 
			System.out.print("False"); 
		} 
	} 
} 