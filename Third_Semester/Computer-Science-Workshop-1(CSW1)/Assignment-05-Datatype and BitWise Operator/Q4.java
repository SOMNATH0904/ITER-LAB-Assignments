// Question 4 : Write a program that takes a 64-bit word and returns the 64-bit word consisting of the bits of the input word in reverse order. For example, if the input is alternating 1s and 0s, i.e., (1010...10), the output should be alternating 0s and 1s, i.e.,(0101...01).

public class Q4 {

    static void reverse(char str[], int start, int end) {
        char temp;
        while(start <= end) {
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    static char[] reverseWords(char[] s) {
        int start = 0;
        for(int end = 0; end < s.length; end++) {
            if (s[end] == ' ') {
                reverse(s, start, end);
                start = end + 1;
            }
        }
        reverse(s, start, s.length - 1);
        reverse(s, 0, s.length - 1);
        return s;
    }

    public static void main(String[] args) {
        String s = "Hello World ";
        char[] p = reverseWords(s.toCharArray());
        System.out.print(p);
    }
}