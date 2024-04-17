import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Convert to lowercase");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Search for a character");
            System.out.println("4. Search for an index");
            System.out.println("5. Concatenate with another string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Lowercase: " + inputString.toLowerCase());
                    break;
                case 2:
                    System.out.println("Uppercase: " + inputString.toUpperCase());
                    break;
                case 3:
                    System.out.print("Enter the character to search for: ");
                    char searchChar = scanner.nextLine().charAt(0);
                    int index = inputString.indexOf(searchChar);
                    if (index != -1) {
                        System.out.println("Character '" + searchChar + "' found at index: " + index);
                    } else {
                        System.out.println("Character '" + searchChar + "' not found in the string.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the index to search for: ");
                    int searchIndex = scanner.nextInt();
                    if (searchIndex >= 0 && searchIndex < inputString.length()) {
                        System.out.println("Character at index " + searchIndex + ": " + inputString.charAt(searchIndex));
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 5:
                    System.out.print("Enter the string to concatenate: ");
                    String concatString = scanner.nextLine();
                    System.out.println("Concatenated string: " + inputString.concat(concatString));
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}

/**
 * OUTPUT
 *
 * Enter a string:
 * Hello world
 *
 * Menu:
 * 1. Convert to lowercase
 * 2. Convert to uppercase
 * 3. Search for a character
 * 4. Search for an index
 * 5. Concatenate with another string
 * 6. Exit
 * Enter your choice: 1
 * Lowercase: hello world
 *
 * Menu:
 * 1. Convert to lowercase
 * 2. Convert to uppercase
 * 3. Search for a character
 * 4. Search for an index
 * 5. Concatenate with another string
 * 6. Exit
 * Enter your choice: 2
 * Uppercase: HELLO WORLD
 *
 * Menu:
 * 1. Convert to lowercase
 * 2. Convert to uppercase
 * 3. Search for a character
 * 4. Search for an index
 * 5. Concatenate with another string
 * 6. Exit
 * Enter your choice: 3
 * Enter the character to search for: world
 * Character 'w' found at index: 6
 *
 * Menu:
 * 1. Convert to lowercase
 * 2. Convert to uppercase
 * 3. Search for a character
 * 4. Search for an index
 * 5. Concatenate with another string
 * 6. Exit
 * Enter your choice: 4
 * Enter the index to search for: 2
 * Character at index 2: l
 *
 * Menu:
 * 1. Convert to lowercase
 * 2. Convert to uppercase
 * 3. Search for a character
 * 4. Search for an index
 * 5. Concatenate with another string
 * 6. Exit
 * Enter your choice: 5
 * Enter the string to concatenate: Hey
 * Concatenated string: Hello worldHey
 *
 * Menu:
 * 1. Convert to lowercase
 * 2. Convert to uppercase
 * 3. Search for a character
 * 4. Search for an index
 * 5. Concatenate with another string
 * 6. Exit
 * Enter your choice: 6
 * Exiting...
 */