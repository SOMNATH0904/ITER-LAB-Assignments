/**
 * Ques 5 : Construct a binary search tree (BST) from the given array of elements: {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}. Include a method called 'CreateTree' to construct the binary search tree from a sorted array. This method takes an array of integers as input and constructs the tree recursively using a binary search algorithm.
 */

/**
 * CODE
 */

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinaryTree {
    TreeNode root;

    public TreeNode createTree(int[] arr, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);

        node.left = createTree(arr, start, mid - 1);
        node.right = createTree(arr, mid + 1, end);

        return node;
    }
}

public class Q05 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        BinaryTree tree = new BinaryTree();
        tree.root = tree.createTree(arr, 0, arr.length - 1);
        System.out.println("Binary Search Tree constructed from the given array : ");
        printInOrder(tree.root);
    }
    public static void printInOrder(TreeNode node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.val+" ");
        printInOrder(node.right);
    }
}

/**
 * OUTPUT
 * 
 * Binary Search Tree constructed from the given array : 
 * 10 20 30 40 50 60 70 80 90 100
 */