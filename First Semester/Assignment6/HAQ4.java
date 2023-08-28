package Assignment6;

import java.util.Scanner;

public class HAQ4 {

    public static int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String inputString = sc.nextLine();
        int wordCount = countWords(inputString);
        System.out.println("Number of words in the string: " + wordCount);
    }
}

