// Ques 5 : Given a list n arr, find the element which appears maximum number of times(MaxOccurence)

public class Q5 {
    public static int findMaxOccurrence(int[] arr) {
        int maxCount = 0;
        int maxElement = arr[0];
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 7, 9, 3, 5, 3, 7, 9, 9, 9};
        int result = findMaxOccurrence(arr);
        System.out.println("The element that appears the most is: " + result);
    }
}
