package Assignment1;

public class Q7 {
    public static void main(String[] args) {
        int x=5;
        System.out.println("The value of x:"+x);
        int y=7;
        System.out.println("The value of y:"+y);
        int z;
        z=x;
        x=y;
        y=z;
        System.out.println("After Swapping X and Y ");
        System.out.println("The value of x:"+x);
        System.out.println("The value of y:"+y);
    }
}
