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

import java.util.HashMap;

public class HashTable {
    private HashMap<String, Integer> table;

    public HashTable() {
        table = new HashMap<>();
    }

    public void insert(String str) {
        if (str == null) {
            return;
        }
        str = str.toLowerCase();
        if (table.containsKey(str)) {
            table.put(str, table.get(str) + 1);
        } else {
            table.put(str, 1);
        }
    }

    public boolean search(String str) {
        if (str == null) {
            return false;
        }
        str = str.toLowerCase(); 
        return table.containsKey(str);
    }

    public int getFrequency(String str) {
        if (str == null) {
            return 0;
        }
        str = str.toLowerCase();
        return table.getOrDefault(str, 0);
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.insert("apple");
        hashTable.insert("banana");
        hashTable.insert("apple");
        hashTable.insert("orange");

        System.out.println("Frequency of 'apple': " + hashTable.getFrequency("apple")); 
        System.out.println("Frequency of 'banana': " + hashTable.getFrequency("banana")); 
        System.out.println("Frequency of 'grape': " + hashTable.getFrequency("grape")); 

        System.out.println("Search 'apple': " + hashTable.search("apple")); 
        System.out.println("Search 'mango': " + hashTable.search("mango"));
    }
}

/**
 * OUTPUT :
 * 
 * Frequency of 'apple': 2
 * Frequency of 'banana': 1
 * Frequency of 'grape': 0
 * Search 'apple': true
 * Search 'mango': false
 */