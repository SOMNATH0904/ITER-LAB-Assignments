import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        char[] charArray = inputString.toCharArray();

        System.out.println("Enter a character to search in the string:");
        char searchChar = scanner.next().charAt(0);

        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == searchChar) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }

        System.out.println("\nCharacter array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        if (firstIndex != -1) {
            System.out.println("First occurrence of '" + searchChar + "' at position: " + firstIndex);
            System.out.println("Last occurrence of '" + searchChar + "' at position: " + lastIndex);
        } else {
            System.out.println("The character '" + searchChar + "' was not found in the string.");
        }

        scanner.close();
    }
}

/**
 * OUTPUT
 *
 * Enter a string:
 * Hello
 * Enter a character to search in the string:
 * e
 *
 * Character array:
 * H e l l o
 * First occurrence of 'e' at position: 1
 * Last occurrence of 'e' at position: 1
 */