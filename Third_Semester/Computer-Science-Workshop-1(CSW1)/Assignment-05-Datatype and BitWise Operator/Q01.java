// Question 1 : Write a java program to count the number of bits that are set to 1 in an integer.

public class Q01 {

    static int countBits(int n)
    {
        int count = 0;
        while(n > 0) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Number of bits present : "+countBits(6));
    }

}