import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        String concatMethodResult = firstString.concat(secondString);
        String plusOperatorResult = firstString + secondString;

        System.out.println("\nConcatenation using concat() method: " + concatMethodResult);
        System.out.println("Concatenation using + operator: " + plusOperatorResult);

        System.out.println("\nEnter an index number to retrieve the character:");
        int index = scanner.nextInt();

        if (index >= 0 && index < concatMethodResult.length()) {
            char characterAtIndex = concatMethodResult.charAt(index);
            System.out.println("Character at index " + index + ": " + characterAtIndex);
        } else {
            System.out.println("Invalid index. Please enter a valid index within the range of the concatenated string.");
        }

        scanner.close();
    }
}

/**
 * OUTPUT
 *
 * Enter the first string:
 * Hello World
 * Enter the second string:
 * I want to eat Ice-Cream ... Khane Chale ?
 *
 * Concatenation using concat() method: Hello WorldI want to eat Ice-Cream ... Khane Chale ?
 * Concatenation using + operator: Hello WorldI want to eat Ice-Cream ... Khane Chale ?
 *
 * Enter an index number to retrieve the character:
 * 3
 * Character at index 3: l
 */