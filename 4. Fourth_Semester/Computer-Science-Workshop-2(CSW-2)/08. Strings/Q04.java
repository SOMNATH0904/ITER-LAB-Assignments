import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(input);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add a substring at a specified position");
            System.out.println("2. Remove a range of characters");
            System.out.println("3. Modify a character at a specified index");
            System.out.println("4. Concatenate another string at the end");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Enter substring to add:");
                    String substringToAdd = scanner.nextLine();
                    System.out.println("Enter position to add:");
                    int positionToAdd = scanner.nextInt();
                    stringBuilder.insert(positionToAdd, substringToAdd);
                    break;
                case 2:
                    System.out.println("Enter start index to remove:");
                    int startIndexToRemove = scanner.nextInt();
                    System.out.println("Enter end index to remove:");
                    int endIndexToRemove = scanner.nextInt();
                    stringBuilder.delete(startIndexToRemove, endIndexToRemove);
                    break;
                case 3:
                    System.out.println("Enter index to modify:");
                    int indexToModify = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter character to replace:");
                    char characterToReplace = scanner.nextLine().charAt(0);
                    stringBuilder.setCharAt(indexToModify, characterToReplace);
                    break;
                case 4:
                    System.out.println("Enter string to concatenate:");
                    String stringToConcatenate = scanner.nextLine();
                    stringBuilder.append(stringToConcatenate);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    continue;
            }

            System.out.println("Modified string: " + stringBuilder.toString());
        }
    }
}

/**
 * OUTPUT
 *
 * Enter a string:
 * Hey!
 *
 * Choose an operation:
 * 1. Add a substring at a specified position
 * 2. Remove a range of characters
 * 3. Modify a character at a specified index
 * 4. Concatenate another string at the end
 * 5. Exit
 * 1
 * Enter substring to add:
 * My name is Somnath
 * Enter position to add:
 * 4
 * Modified string: Hey!My name is Somnath
 *
 * Choose an operation:
 * 1. Add a substring at a specified position
 * 2. Remove a range of characters
 * 3. Modify a character at a specified index
 * 4. Concatenate another string at the end
 * 5. Exit
 * 3
 * Enter index to modify:
 * 3
 * Enter character to replace:
 * Mah
 * Modified string: HeyMMy name is Somnath
 *
 * Choose an operation:
 * 1. Add a substring at a specified position
 * 2. Remove a range of characters
 * 3. Modify a character at a specified index
 * 4. Concatenate another string at the end
 * 5. Exit
 * 4
 * Enter string to concatenate:
 * Hello World
 * Modified string: HeyMMy name is SomnathHello World
 *
 * Choose an operation:
 * 1. Add a substring at a specified position
 * 2. Remove a range of characters
 * 3. Modify a character at a specified index
 * 4. Concatenate another string at the end
 * 5. Exit
 * 5
 * Exiting...
 */