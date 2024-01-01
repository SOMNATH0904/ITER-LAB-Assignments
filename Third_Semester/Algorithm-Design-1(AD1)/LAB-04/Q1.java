import java.util.Scanner;

public class Q1 {

    public static void print(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void arrayReduction(int[] arr) {
        bubbleSort(arr);
        int n = arr.length;
        int count = 1;
        int reduction = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i]-reduction > 0) {
                System.out.println(n-i);
                reduction = arr[i];
                count++;
            }
        }
        System.out.println("Total count of Array Reduction : "+count);
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
        System.out.println("Elements present in an array : ");
        print(arr);
        arrayReduction(arr);
    }
}