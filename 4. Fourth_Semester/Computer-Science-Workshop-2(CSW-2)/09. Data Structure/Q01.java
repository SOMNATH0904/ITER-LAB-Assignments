/**
 * Ques 1 : Create a class BSTNode that contains a member 'info' to store a number, with 'left' 
 *        referring to the left child and 'right' referring to the right child. Provide the necessary 
 *        constructor. Additionally, create a method to insert a node into a binary search tree.
 */

/**
 * CODE
 */


//CODE

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void insert(int val) {
        if (val < data) {
            if (left == null) {
                left = new Node(val);
            } else {
                left.insert(val);
            }
        } else if (val > data) {
            if (right == null) {
                right = new Node(val);
            } else {
                right.insert(val);
            }
        }
    }
}

public class Q01 {

    public static void printBST(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");
            printBST(root.left);
            printBST(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.insert(5);
        root.insert(15);
        root.insert(3);
        root.insert(7);
        root.insert(12);
        root.insert(18);

        System.out.println("Binary Search Tree : ");
        printBST(root);
    }
}

/**
 * OUTPUT
 * 
 * Binary Search Tree : 10 5 3 7 15 12 18 
 */