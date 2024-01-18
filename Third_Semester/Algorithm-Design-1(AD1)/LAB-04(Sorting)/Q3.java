// Ques 3 : Check reverse

import java.util.Arrays;

class Q3 {
    public static boolean checkReverse(int arr[], int n) {
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        int front;
        for(front = 0; front < n; front++) {
            if(temp[front] != arr[front]) {
                break;
            }
        }
        int back;
        for(back = n-1; back >= 0; back--) {
            if(temp[back] != arr[back]) {
                break;
            }
        }
        if(front >= back) {
            return true;
        }
        do{
            front++;
            if (arr[front - 1] < arr[front]) {
                return false;
            }
        } while(front != back);
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 4, 3};
        int n = arr.length;
        System.out.print("Is the Array Sorted : ");
        if (checkReverse(arr, n)) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
