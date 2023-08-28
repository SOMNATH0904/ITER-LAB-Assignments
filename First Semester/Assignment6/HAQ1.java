package Assignment6;

import java.util.Scanner;

public class HAQ1 {

    public static char findFirstNonRepeatedChar(String str) {
        int[] charCount = new int[256];
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String inputString = sc.nextLine();
        char firstNonRepeatedChar = findFirstNonRepeatedChar(inputString);
        if(firstNonRepeatedChar != '\0') {
            System.out.println("The first non-repeated character is: "+firstNonRepeatedChar);
        } else {
            System.out.println("No non-repeated character found in the String.");
        }
    }

}
