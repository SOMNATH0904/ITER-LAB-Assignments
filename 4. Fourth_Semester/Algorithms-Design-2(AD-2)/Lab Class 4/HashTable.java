import java.util.HashMap;

public class HashTable {
    private HashMap<String, Integer> table;

    public HashTable() {
        table = new HashMap<>();
    }

    // Method to insert a string into the hash table
    public void insert(String str) {
        if (str == null) {
            return;
        }
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        if (table.containsKey(str)) {
            table.put(str, table.get(str) + 1); // Increment frequency if already exists
        } else {
            table.put(str, 1); // Add new entry with frequency 1
        }
    }

    // Method to search for a string in the hash table
    public boolean search(String str) {
        if (str == null) {
            return false;
        }
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        return table.containsKey(str);
    }

    // Method to get the frequency of a string in the hash table
    public int getFrequency(String str) {
        if (str == null) {
            return 0;
        }
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        return table.getOrDefault(str, 0);
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.insert("apple");
        hashTable.insert("banana");
        hashTable.insert("apple");
        hashTable.insert("orange");

        System.out.println("Frequency of 'apple': " + hashTable.getFrequency("apple")); // Output: 2
        System.out.println("Frequency of 'banana': " + hashTable.getFrequency("banana")); // Output: 1
        System.out.println("Frequency of 'grape': " + hashTable.getFrequency("grape")); // Output: 0

        System.out.println("Search 'apple': " + hashTable.search("apple")); // Output: true
        System.out.println("Search 'mango': " + hashTable.search("mango")); // Output: false
    }
}
