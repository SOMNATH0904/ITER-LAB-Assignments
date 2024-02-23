package Assignment1;

public class Q8 {
    public static void main(String[] args) {
        int x=4;
        int y=5;

        System.out.println("Before Swapping x:- "+x);
        System.out.println("Before Bwapping y:- "+y);
        System.out.println();

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("After Swapping x:- "+x);
        System.out.println("After Swapping y:- "+y);
    }
}
