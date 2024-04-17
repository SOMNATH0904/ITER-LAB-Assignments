import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        String firstLower = firstString.toLowerCase();
        String firstUpper = firstString.toUpperCase();
        String secondLower = secondString.toLowerCase();
        String secondUpper = secondString.toUpperCase();

        boolean isEqualIgnoreCase = firstLower.equals(secondLower);

        System.out.println("\nFirst String:");
        System.out.println("Lowercase: " + firstLower);
        System.out.println("Uppercase: " + firstUpper);
        System.out.println("\nSecond String:");
        System.out.println("Lowercase: " + secondLower);
        System.out.println("Uppercase: " + secondUpper);
        System.out.println("\nComparison (case-insensitive): " + isEqualIgnoreCase);

        scanner.close();
    }
}

/**
 * OUTPUT
 *
 * Enter the first string:
 * Hey
 * Enter the second string:
 * My name is somnath
 *
 * First String:
 * Lowercase: hey
 * Uppercase: HEY
 *
 * Second String:
 * Lowercase: my name is somnath
 * Uppercase: MY NAME IS SOMNATH
 *
 * Comparison (case-insensitive): false
 */