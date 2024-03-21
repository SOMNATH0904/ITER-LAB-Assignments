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
