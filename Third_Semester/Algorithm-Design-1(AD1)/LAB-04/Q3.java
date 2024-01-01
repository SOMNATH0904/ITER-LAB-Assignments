import java.util.Scanner;

public class Q3 {

    public static void print(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int i, int j) {
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static boolean sortedCheck(int[] arr) {
        int flag = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] > arr[i]) {
                flag = 1;
            }
            return false;
        }
        return true;
    }
    public static void reverseSortedCheck(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                reverse(arr, i, j);
                boolean res = sortedCheck(arr);
                if(res == true) {
                    System.out.println("Reversing the Subarray : ");
                    reverse(arr, i, j);
                }
                for(int k = i; k <= j; k++) {
                    System.out.println(arr[k] + " ");
                    System.out.println("Makes the Array Sorted!!");
                }
                reverse(arr, i, j);
            }
        }
        System.out.println("There is no SubArray whose reversal makes the array sorted");
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
        System.out.println("Array Elements are : ");
        print(arr);
        reverseSortedCheck(arr);
    }
}
