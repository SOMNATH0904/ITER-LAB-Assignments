// Question 3 : Write a program to swap the ith bit with jth bit of a number.

public class Q3 {

    public static int swapBits(int num, int i, int j) {
        int ithBit = (num >> i) & 1;
        int jthBit = (num >> j) & 1;
        if (ithBit != jthBit) {
            int num1 = 1 << i;
            int num2 = 1 << j;
            num ^= num1;
            num ^= num2;
        }
        return num;
    }

    public static void main(String[] args) {
        int n = 40;
        int i = 1;
        int j = 5;
        System.out.println("Original number: " + n);
        System.out.println("Number after swapping ith and jth bits: " + swapBits(n, i, j));
    }
}
