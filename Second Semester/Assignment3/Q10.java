import java.util.Scanner;

public class Q10 {

    public static String reverse(String s) {
        if (s.length() <= 1) {
            return s;
        } else {
            char firstChar = s.charAt(0);
            String restOfString = s.substring(1);
            String reversedRest = reverse(restOfString);
            return reversedRest + firstChar;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String S = sc.nextLine();
        String reversed = reverse(S);
        System.out.println("Reversed String is : "+reversed);
    }
}