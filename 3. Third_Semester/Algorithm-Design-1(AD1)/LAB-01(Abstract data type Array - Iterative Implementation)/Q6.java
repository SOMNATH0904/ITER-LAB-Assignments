// Ques 6 : Maximum minimum array(I/P: 1 2 3 4 5 --> O/P: 5 1 4 2 3)

import java.util.Scanner;

public class Q6 {

    public static void print(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] MaxMin(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                temp[i] = arr[end];
                end--;
            }
            else {
                temp[i] = arr[start];
                start++;
            }
        }
        return temp;
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
        print(arr);
        System.out.println("Maximum Minimum Array is : ");
        int[] arrMaxMin = MaxMin(arr);
        print(arrMaxMin);
    }
}
