// Question 17 : Write a program that returns true if the number is even else returns false. Note: don’t use if else.

public class Q17 {

    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Is the number even !? : "+isEven(n));
    }
}
