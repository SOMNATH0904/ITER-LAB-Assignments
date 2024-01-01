import java.util.Scanner;

public class Q2 {

    public static void print(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        while(i < n1) {
            if(arr1[i] <= arr2[0]) {
                i++;
            }
            else {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
            }
            for(int j = 0; j < n2-1; j++) {
                if(arr2[j] < arr2[j+1])
                    break;
                else {
                    int temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }
        }
        System.out.print("Array 1 is : ");
        print(arr1);
        System.out.print("Array 2 is : ");
        print(arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter size of array 2 : ");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of array 1 : ");
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of array 2 : ");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Array 1 is : ");
        print(arr1);
        System.out.println("Array 2 is : ");
        print(arr2);
        System.out.println("After merging two Arrays --> ");
        merge(arr1, arr2);
    }
}
