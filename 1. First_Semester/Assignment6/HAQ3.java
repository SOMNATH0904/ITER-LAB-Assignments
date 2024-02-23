package Assignment6;

import java.util.Scanner;

public class HAQ3 {

    public static char findMiddleCharacter(String str) {
        int length = str.length();
        int middleIndex = length / 2;

        if (length % 2 == 0) {  // If the length is even, return the second middle character
            return str.charAt(middleIndex);
        } else {    // If the length is odd, return the middle character
            return str.charAt(middleIndex);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String inputString1 = sc.nextLine();
        System.out.println("Enter Second String : ");
        String inputString2 = sc.nextLine();
        char middleChar1 = findMiddleCharacter(inputString1);
        char middleChar2 = findMiddleCharacter(inputString2);
        System.out.println("The middle character in the string \"" + inputString1 + "\": " + middleChar1);
        System.out.println("The middle character in the string \"" + inputString2 + "\": " + middleChar2);
    }

}

