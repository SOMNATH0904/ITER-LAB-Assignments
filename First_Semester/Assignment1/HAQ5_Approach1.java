package Assignment1;

public class HAQ5_Approach1 {
    public static void main(String[] args) {    // With using an extra variable ...
        int w = 1, a = 2, k = 3, g = 4;
        System.out.println("Before Swapping w is : "+w);
        System.out.println("Before Swapping a is : "+a);
        System.out.println("Before Swapping k is : "+k);
        System.out.println("Before Swapping g is : "+g);
        int temp = w;
        w = g;
        g = k;
        k = a;
        a = temp;
        System.out.println("After Swapping w is : "+w);
        System.out.println("After Swapping a is : "+a);
        System.out.println("After Swapping k is : "+k);
        System.out.println("After Swapping g is : "+g);
    }
}
