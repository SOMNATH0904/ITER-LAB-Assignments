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

class Node {
    String data;
    int frequency;
    Node left, right;

    public Node(String item) {
        data = item;
        frequency = 1;
        left = right = null;
    }
}

public class BinarySearchTree {
    private Node root;

    BinarySearchTree() {
        root = null;
    }

    public void insert(String data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, String data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        int cmp = data.compareTo(root.data);
        if (cmp < 0)
            root.left = insertRec(root.left, data);
        else if (cmp > 0)
            root.right = insertRec(root.right, data);
        else
            root.frequency++;

        return root;
    }

    public boolean search(String data) {
        return searchRec(root, data);
    }

    private boolean searchRec(Node root, String data) {
        if (root == null)
            return false;

        int cmp = data.compareTo(root.data);
        if (cmp < 0)
            return searchRec(root.left, data);
        else if (cmp > 0)
            return searchRec(root.right, data);
        else
            return true;
    }

    public int getFrequency(String data) {
        return getFrequencyRec(root, data);
    }

    private int getFrequencyRec(Node root, String data) {
        if (root == null)
            return 0;

        int cmp = data.compareTo(root.data);
        if (cmp < 0)
            return getFrequencyRec(root.left, data);
        else if (cmp > 0)
            return getFrequencyRec(root.right, data);
        else
            return root.frequency;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("apple");
        tree.insert("banana");
        tree.insert("apple");
        tree.insert("orange");
        tree.insert("banana");

        System.out.println("Search result for 'apple': " + tree.search("apple"));
        System.out.println("Search result for 'grape': " + tree.search("grape"));

        System.out.println("Frequency of 'apple': " + tree.getFrequency("apple"));
        System.out.println("Frequency of 'banana': " + tree.getFrequency("banana"));
        System.out.println("Frequency of 'grape': " + tree.getFrequency("grape"));
    }
}

/**
 * OUTPUT :
 * 
 * Search result for 'apple': true
 * Search result for 'grape': false
 * Frequency of 'apple': 2
 * Frequency of 'banana': 2
 * Frequency of 'grape': 0
 */