package HomeAssignment;

import java.util.Scanner;

public class Q2 {

    public static int binarySearch(int[] arr, int start, int end, int key) {
        if(end >= start && start <= arr.length-1) {
            int mid = start + (end-start)/2;
            if(arr[mid] == key)
                return mid;
            if(arr[mid] > key)
                return binarySearch(arr, start, mid-1, key);
            return binarySearch(arr, mid+1, end, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of elements in Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an Array : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to Search : ");
        int x = sc.nextInt();

        System.out.println("The "+x+" is Present at index : "+binarySearch(arr, 0, arr.length-1, x));
    }
}