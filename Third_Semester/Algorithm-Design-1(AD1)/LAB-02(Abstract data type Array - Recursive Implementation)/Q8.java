// Ques 8 : Smallest positive missing number

import java.util.Scanner;

public class Q8 {

    public static boolean search(int[] arr, int l, int r, int x) {
        if(r < l) return false;
        if(arr[l] == x) return true;
        if(arr[r] == x) return true;
        return search(arr, l+1, r-1, x);
    }

    public static int missing(int[] arr, int x) {
        if(!search(arr, 0, arr.length-1, x))    return x;
        if(x == arr.length) return x+1;
        return missing(arr, x+1);
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
        int x = arr[0];
        System.out.println("Missing number in the array is : "+missing(arr, x));
    }
}
