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

    // Method to insert a new string into the tree
    public void insert(String data) {
        root = insertRec(root, data);
    }

    // A recursive function to insert a new string into the tree
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

    // Method to search for a string in the tree
    public boolean search(String data) {
        return searchRec(root, data);
    }

    // A recursive function to search for a string in the tree
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

    // Method to get the frequency of a string in the tree
    public int getFrequency(String data) {
        return getFrequencyRec(root, data);
    }

    // A recursive function to get the frequency of a string in the tree
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

        // Insert some strings
        tree.insert("apple");
        tree.insert("banana");
        tree.insert("apple");
        tree.insert("orange");
        tree.insert("banana");

        // Search for a string
        System.out.println("Search result for 'apple': " + tree.search("apple"));
        System.out.println("Search result for 'grape': " + tree.search("grape"));

        // Get frequency of strings
        System.out.println("Frequency of 'apple': " + tree.getFrequency("apple"));
        System.out.println("Frequency of 'banana': " + tree.getFrequency("banana"));
        System.out.println("Frequency of 'grape': " + tree.getFrequency("grape"));
    }
}
