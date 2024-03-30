public class Q20 {
    public static void recursiveTraversal(int[] arr, int idx) {
        if(idx >= 0 && idx < arr.length) {
            System.out.println("Element at idx "+idx+" : "+arr[idx]);
            recursiveTraversal(arr, idx + 1);
        } else {
            System.err.println("Index out of bounds : "+idx);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        recursiveTraversal(arr, 0);
    }
}

/**
 * OUTPUT
 * Element at idx 0 : 1
 * Element at idx 1 : 2
 * Element at idx 2 : 3
 * Element at idx 3 : 4
 * Element at idx 4 : 5
 * Index out of bounds : 5
 */