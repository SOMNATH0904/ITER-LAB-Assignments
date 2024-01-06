// Question 2 : The parity of a binary word is 1 if the number of 1s in the word is odd; otherwise, it is 0. Write a java program to count the parity of an integer number.

public class Q02 {

    public static int countBits(int n) {
        int count = 0;
        while(n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static int getParity(int n) {
        int bitCount = countBits(n);
        return bitCount % 2;
    }

    public static void main(String[] args) {
        System.out.println("The parity of an integer number is : "+getParity(254));
    }
}