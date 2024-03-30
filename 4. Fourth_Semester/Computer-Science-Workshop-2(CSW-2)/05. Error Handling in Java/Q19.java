import java.util.Arrays;

public class Q19 {
    public static void sortArray(int[] array) {
        try {
            Arrays.sort(array);
            System.out.println("Sorted array : "+Arrays.toString(array));
            int element = array[array.length];
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException occurred : "+e.getMessage());
        }
    }

    public static void searchElement(int[] arr, int target) {
        try {
            int idx = Arrays.binarySearch(arr, target);
            if (idx >= 0) {
                System.out.println("Element "+target+" found at idx "+idx);
            } else {
                System.out.println("Element "+target+" not found in the arr");
            }
            int element = arr[arr.length + 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException occurred : "+e.getMessage());
        }
    }

    public static void accessElements(int[] array) {
        try {
            System.out.println("Element at index 2: "+array[2]);
            System.out.println("Element at index 5: "+array[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException occurred : "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7};
        sortArray(array);
        searchElement(array, 7);
        accessElements(array);
    }
}

/**
 * OUTPUT
 * Sorted array : [1, 2, 5, 7, 9]
 * Element 7 found at idx 3
 * ArrayIndexOutOfBoundsException occurred : Index 5 out of bounds for length 5
 * ArrayIndexOutOfBoundsException occurred : Index 6 out of bounds for length 5
 * ArrayIndexOutOfBoundsException occurred : Index 5 out of bounds for length 5
 * Element at index 2: 5
 */