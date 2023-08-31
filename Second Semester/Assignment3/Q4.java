import java.util.Scanner;

public class Q4 {

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array : ");
        int n = sc.nextInt();

        Integer[] intArr = new Integer[n];
        System.out.println("Enter the Integer Array elements : ");
        for(int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }
        System.out.println("Integer Array Elements are : ");
        printArray(intArr);

        Double[] doubleArr = new Double[n];
        System.out.println("Enter the Double Array elements : ");
        for(int i = 0; i < n; i++) {
            doubleArr[i] = sc.nextDouble();
        }
        System.out.println("Double Array Elements are : ");
        printArray(doubleArr);
    }
}