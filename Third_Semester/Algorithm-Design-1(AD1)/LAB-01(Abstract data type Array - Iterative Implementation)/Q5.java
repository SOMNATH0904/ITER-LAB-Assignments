// Ques 5 : Smallest positive missing number

import java.util.Scanner;

public class Q5 {

    public static int max(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int missing(int[] arr) {
        for(int i = 1; i < max(arr); i++) {
            int flag = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        return max(arr)+1;
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
        System.out.println("Missing No Present in the Array is : "+missing(arr));
    }
}
