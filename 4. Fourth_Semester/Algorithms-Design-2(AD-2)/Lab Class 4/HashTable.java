/**
 * Ques 2 : Write a java program to implement Hash table to store strings and its frequencies. Define methods for insertion of String, Searching a string and returning frequency of the string.
 */

/**
 * ALGORITHM
 * 
 * 1.HashNode Class:
 * Define a class HashNode containing:
 * key: a string representing the key.
 * frequency: an integer representing the frequency of the key.
 * Constructor to initialize key and frequency.
 * 
 * 2.HashTable Class:
 * Define a class HashTable.
 * Private Constants:
 * TABLE_SIZE: an integer representing the size of the hash table.
 * Private Variables:
 * table: an array of linked lists to store HashNode objects.
 * Constructor:
 * Initializes the table array with size TABLE_SIZE.
 * Initializes each element of the table with an empty linked list.
 * hashFunction Method:
 * Takes a string key as input.
 * Computes a hash value for the key using a simple hash function.
 * Returns the hash value modulo TABLE_SIZE.
 * insert Method:
 * Takes a string key as input.
 * Computes the hash value of the key.
 * Retrieves the linked list at the computed index from the table.
 * Iterates through the linked list to find the node with the given key.
 * If found, increments the frequency of the node.
 * If not found, adds a new HashNode with the key and frequency set to 1 to the linked list.
 * searchFrequency Method:
 * Takes a string key as input.
 * Computes the hash value of the key.
 * Retrieves the linked list at the computed index from the table.
 * Iterates through the linked list to find the node with the given key.
 * If found, returns the frequency of the node.
 * If not found, returns 0.
 * 
 * Main Class:
 * Creates a HashTable object.
 * Inserts strings into the hash table.
 * Searches for frequencies of specific strings and prints the results.
 */

import java.util.Hashtable;
import java.util.Scanner;

public class HashTable {
    private Hashtable<String, Integer> hashTable;

    public HashTable() {
        hashTable = new Hashtable<>();
    }

    public void insertString(String str) {
        if (hashTable.containsKey(str)) {
            hashTable.put(str, hashTable.get(str) + 1);
        } else {
            hashTable.put(str, 1);
        }
        System.out.println("String '" + str + "' inserted successfully.");
    }

    public void searchString(String str) {
        if (hashTable.containsKey(str)) {
            System.out.println("String '" + str + "' found in the hash table.");
        } else {
            System.out.println("String '" + str + "' not found in the hash table.");
        }
    }

    public void getStringFrequency(String str) {
        if (hashTable.containsKey(str)) {
            System.out.println("Frequency of '" + str + "' in the hash table: " + hashTable.get(str));
        } else {
            System.out.println("String '" + str + "' not found in the hash table.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashTable hashTable = new HashTable();

        int ch;
        String inputString;

        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Insert String");
            System.out.println("2. Search String");
            System.out.println("3. Get String Frequency");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = scanner.nextInt();
            scanner.nextLine();

            switch(ch) {
                case 1:
                    System.out.print("Enter string to insert: ");
                    inputString = scanner.nextLine();
                    hashTable.insertString(inputString);
                    break;
                case 2:
                    System.out.print("Enter string to search: ");
                    inputString = scanner.nextLine();
                    hashTable.searchString(inputString);
                    break;
                case 3:
                    System.out.print("Enter string to get frequency: ");
                    inputString = scanner.nextLine();
                    hashTable.getStringFrequency(inputString);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (ch != 4);

        scanner.close();
    }
}


/**
 *  OUTPUT

----- Menu -----
1. Insert String
2. Search String
3. Get String Frequency
4. Exit
Enter your choice: 1
Enter string to insert: hello
String 'hello' inserted successfully.

----- Menu -----
1. Insert String
2. Search String
3. Get String Frequency
4. Exit
Enter your choice: 1
Enter string to insert: somnath
String 'somnath' inserted successfully.

----- Menu -----
1. Insert String
2. Search String
3. Get String Frequency
4. Exit
Enter your choice: 2
Enter string to search: hello
String 'hello' found in the hash table.

----- Menu -----
1. Insert String
2. Search String
3. Get String Frequency
4. Exit
Enter your choice: 3
Enter string to get frequency: somnath
Frequency of 'somnath' in the hash table: 1

----- Menu -----
1. Insert String
2. Search String
3. Get String Frequency
4. Exit
Enter your choice: 4
Exiting...
 */