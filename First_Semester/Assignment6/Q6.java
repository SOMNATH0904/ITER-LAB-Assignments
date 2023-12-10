package Assignment6;

import java.util.Scanner;

public class Q6 {

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String inputString = sc.nextLine();
        System.out.println("Enter a Target Character : ");
        char targetChar = sc.next().charAt(0);
        int charCount = count(inputString, targetChar);
        System.out.println("The character '"+targetChar+"' appears "+charCount+" times in the string.");
    }
}
