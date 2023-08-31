import java.util.Scanner;
public class Q7 {
    static void allTogether(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int max_count = 0;
        int min_count = 0;
        int max_firstOccur = 0;
        int min_lastOccur = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                max_count = 1;
                max_firstOccur = i;
            }
            else if(arr[i] == max) {
                max_count++;
            }

            if(arr[i] < min) {
                min = arr[i];
                min_count = 1;
                min_lastOccur = i;
            }
            else if(arr[i] == min) {
                min_count++;
                min_lastOccur = i;
            }
        }

        System.out.println("Maximum element of Array is "+max+" and occurs "+max_count+" times.");
        System.out.println("Maximum element of Array is "+min+" and occurs "+min_count+" times.");
        System.out.println("First occurrence of maximum element is at position "+max_firstOccur);
        System.out.println("Last occurrence of minimum element is at position "+min_lastOccur);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of an array : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        allTogether(arr);

    }
}