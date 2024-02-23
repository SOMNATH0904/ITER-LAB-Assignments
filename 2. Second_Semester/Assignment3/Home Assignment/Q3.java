package HomeAssignment;

import java.util.Scanner;

public class Q3 {

    static boolean isPalindrome(String str, int s, int e) {
        if(s == e)  return true;
        if((str.charAt(s)) != str.charAt(e))    return false;
        if(s < e+1) return isPalindrome(str, s+1, e-1);
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("Is the Entered String is a Palindromic String : "+isPalindrome(str, 0, str.length()-1));
    }
}