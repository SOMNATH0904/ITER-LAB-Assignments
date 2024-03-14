/**
 * Ques 1 : Write a Java Program to implement brute force for pattern matching in a String.
 */

public class BruteForceSearch {

    public static int bruteForceSearch(String textIn, String patternIn) {
        char[] text = textIn.toCharArray();
        char[] pattern = patternIn.toCharArray();
        final int n = text.length;
        final int m = pattern.length;
        int i = 0, j = 0;

        while(i <= n-m) {
            j = 0;
            while(j < m && pattern[j] == text[i+j]) {
                j++;
            }
            if(j == m) {
                return (i);
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String st1 = "Hello World !";
        String st2 = "World";
        System.out.println("Using Brute Force Search pattern found at index : "+bruteForceSearch(st1, st2));
    }
}
