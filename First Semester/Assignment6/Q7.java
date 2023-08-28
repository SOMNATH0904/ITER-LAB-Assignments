package Assignment6;

import java.util.Scanner;

public class Q7 {

    public static int count(String str) {
        int count = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String inputString = sc.nextLine();
        int vowelCount = count(inputString);
        System.out.println("The number of vowels in the string is: "+vowelCount);
    }
}

