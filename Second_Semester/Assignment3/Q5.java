import java.util.Scanner;

public class Q5 {

    public static <T> int count(T[] array, T item) {
        int count = 0;
        for(T element : array) {
            if(element.equals(item)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in an array : ");
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];
        System.out.println("Enter elements of an array : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to Search : ");
        int x = sc.nextInt();

        System.out.println("Number of times "+x+" present in the array is : "+count(arr,x));
    }
}