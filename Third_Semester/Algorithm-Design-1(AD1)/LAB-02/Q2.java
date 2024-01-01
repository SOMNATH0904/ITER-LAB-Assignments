import java.util.Scanner;

public class Q2 {

    public static int maximum(int[] arr, int n) {
        if(n == 1) return arr[0];
        int max = arr[n-1];
        int ans = maximum(arr, n-1);
        return Math.max(max, ans);
    }

    public static int minimum(int[] arr, int n) {
        if(n == 1) return arr[0];
        int min = arr[n-1];
        int ans = minimum(arr, n-1);
        return Math.min(min, ans);
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
        System.out.println("The Sum will be : "+maximum(arr, n));
    }
}
