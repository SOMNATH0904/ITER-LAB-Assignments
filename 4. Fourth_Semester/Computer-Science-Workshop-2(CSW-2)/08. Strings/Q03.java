import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer text = new StringBuffer();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Append text");
            System.out.println("2. Insert text");
            System.out.println("3. Delete text");
            System.out.println("4. Reverse text");
            System.out.println("5. Replace text");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter text to append:");
                    String appendText = scanner.nextLine();
                    text.append(appendText);
                    displayText(text);
                    break;
                case 2:
                    System.out.println("Enter index to insert:");
                    int insertIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter text to insert:");
                    String insertText = scanner.nextLine();
                    text.insert(insertIndex, insertText);
                    displayText(text);
                    break;
                case 3:
                    System.out.println("Enter start index to delete:");
                    int startIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter end index to delete:");
                    int endIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    text.delete(startIndex, endIndex);
                    displayText(text);
                    break;
                case 4:
                    text.reverse();
                    displayText(text);
                    break;
                case 5:
                    System.out.println("Enter start index to replace:");
                    int replaceStartIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter end index to replace:");
                    int replaceEndIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter replacement text:");
                    String replacementText = scanner.nextLine();
                    text.replace(replaceStartIndex, replaceEndIndex, replacementText);
                    displayText(text);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    private static void displayText(StringBuffer text) {
        System.out.println("Current text: " + text);
        System.out.println("Current capacity: " + text.capacity());
        System.out.println("Current length: " + text.length());
    }
}

/**
 * OUTPUT
 *
 * Choose an operation:
 * 1. Append text
 * 2. Insert text
 * 3. Delete text
 * 4. Reverse text
 * 5. Replace text
 * 6. Exit
 * 1
 * Enter text to append:
 * Helo
 * Current text: Helo
 * Current capacity: 16
 * Current length: 4
 *
 * Choose an operation:
 * 1. Append text
 * 2. Insert text
 * 3. Delete text
 * 4. Reverse text
 * 5. Replace text
 * 6. Exit
 * 2
 * Enter index to insert:
 * 2
 * Enter text to insert:
 * l
 * Current text: Hello
 * Current capacity: 16
 * Current length: 5
 *
 * Choose an operation:
 * 1. Append text
 * 2. Insert text
 * 3. Delete text
 * 4. Reverse text
 * 5. Replace text
 * 6. Exit
 * 4
 * Current text: olleH
 * Current capacity: 16
 * Current length: 5
 *
 * Choose an operation:
 * 1. Append text
 * 2. Insert text
 * 3. Delete text
 * 4. Reverse text
 * 5. Replace text
 * 6. Exit
 * 5
 * Enter start index to replace:
 * 1
 * Enter end index to replace:
 * 3
 * Enter replacement text:
 * o
 * Current text: ooeH
 * Current capacity: 16
 * Current length: 4
 *
 * Choose an operation:
 * 1. Append text
 * 2. Insert text
 * 3. Delete text
 * 4. Reverse text
 * 5. Replace text
 * 6. Exit
 * 6
 * Exiting...
 */