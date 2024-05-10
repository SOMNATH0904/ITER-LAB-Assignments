/**
 * Ques 1 : Write a java program to implement Binary Search Tree to store strings and its frequencies. Define methods for insertion of String, Searching a string and returning frequency of the string.
 */

/**
 * ALGORITHM 
 * 
 * 1. Node Class:
 * Define a class Node containing:
 * key: a string value.
 * frequency: an integer representing the frequency of the key.
 * left and right: references to left and right child nodes.
 * 
 * 2. BinarySearchTree Class:
 * Initialize root as null in the constructor.
 * 
 * 3. insert Method:
 * Insert a new string into the binary search tree.
 * Utilize a recursive method insertRec:
 * If the tree is empty, create a new node with the given key.
 * Return down the tree based on the comparison of keys.
 * If the key already exists, increment its frequency.
 * 
 * 4. search Method:
 * Search for a string in the binary search tree.
 * Utilize a recursive method search.
 * Return the node if found or null if not found.
 * 
 * 5. getFrequency Method:
 * Get the frequency of a string in the binary search tree.
 * Call the search method to find the node with the given key.
 * If the node exists, return its frequency. Otherwise, return 0.
 *
 * 6. Main Method:
 * Create a BinarySearchTree object.
 * Insert strings into the tree.
 * Search for a specific string and print its frequency if found.
 * Get the frequency of another string and print it.
 */

import java.util.Scanner;

class Node {
    String data;
    int frequency;
    Node left, right;

    Node(String value) {
        data = value;
        frequency = 1;
        left = right = null;
    }
}

class BST {
    private Node root;

    BST() {
        root = null;
    }

    void insert(String data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, String data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        int compareResult = data.compareTo(root.data);

        if (compareResult < 0)
            root.left = insertRec(root.left, data);
        else if (compareResult > 0)
            root.right = insertRec(root.right, data);
        else // If the string is already present, increment its frequency
            root.frequency++;

        return root;
    }

    boolean search(String data) {
        return searchRec(root, data);
    }

    private boolean searchRec(Node root, String data) {
        if (root == null)
            return false;

        int compareResult = data.compareTo(root.data);

        if (compareResult < 0)
            return searchRec(root.left, data);
        else if (compareResult > 0)
            return searchRec(root.right, data);
        else
            return true;
    }

    int getFrequency(String data) {
        return getFrequencyRec(root, data);
    }

    private int getFrequencyRec(Node root, String data) {
        if (root == null)
            return 0;

        int compareResult = data.compareTo(root.data);

        if (compareResult < 0)
            return getFrequencyRec(root.left, data);
        else if (compareResult > 0)
            return getFrequencyRec(root.right, data);
        else
            return root.frequency;
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST bst = new BST();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert a string");
            System.out.println("2. Search for a string");
            System.out.println("3. Get frequency of a string");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the string to insert: ");
                    String insertString = scanner.nextLine();
                    bst.insert(insertString);
                    System.out.println("String inserted successfully.");
                    break;
                case 2:
                    System.out.print("Enter the string to search: ");
                    String searchString = scanner.nextLine();
                    if (bst.search(searchString))
                        System.out.println("String found.");
                    else
                        System.out.println("String not found.");
                    break;
                case 3:
                    System.out.print("Enter the string to get frequency: ");
                    String freqString = scanner.nextLine();
                    int frequency = bst.getFrequency(freqString);
                    System.out.println("Frequency of the string: " + frequency);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        scanner.close();
    }
}


/**
 * OUTPUT
 * 
Menu:
1. Insert a string
2. Search for a string
3. Get frequency of a string
4. Exit
Enter your choice: 1
Enter the string to insert: Hello
String inserted successfully.

Menu:
1. Insert a string
2. Search for a string
3. Get frequency of a string
4. Exit
Enter your choice: 3
Enter the string to get frequency: Hello
Frequency of the string: 1

Menu:
1. Insert a string
2. Search for a string
3. Get frequency of a string
4. Exit
Enter your choice: 1
Enter the string to insert: hello
String inserted successfully.

Menu:
1. Insert a string
2. Search for a string
3. Get frequency of a string
4. Exit
Enter your choice: 1
Enter the string to insert: Hello
String inserted successfully.

Menu:
1. Insert a string
2. Search for a string
3. Get frequency of a string
4. Exit
Enter your choice: 3
Enter the string to get frequency: hello
Frequency of the string: 1

Menu:
1. Insert a string
2. Search for a string
3. Get frequency of a string
4. Exit
Enter your choice: 3
Enter the string to get frequency: Hello
Frequency of the string: 2

Menu:
1. Insert a string
2. Search for a string
3. Get frequency of a string
4. Exit
Enter your choice: 3
Enter the string to get frequency: hello
Frequency of the string: 1

Menu:
1. Insert a string
2. Search for a string
3. Get frequency of a string
4. Exit
Enter your choice: 4
Exiting...

 */