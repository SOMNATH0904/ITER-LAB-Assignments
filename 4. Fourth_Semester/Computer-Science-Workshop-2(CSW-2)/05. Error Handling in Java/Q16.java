public class Q16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            int element = arr[10];
            System.out.println("Element : "+element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException Occurred : "+e.getMessage());
        }
    }
}

/**
 * OUTPUT
 * ArrayIndexOutOfBoundsException Occurred : Index 10 out of bounds for length 5
 */