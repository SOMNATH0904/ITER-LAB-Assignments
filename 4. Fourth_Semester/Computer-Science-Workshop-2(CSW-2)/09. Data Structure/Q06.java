/**
 * Ques 6 : Determine if a given binary tree is a binary search tree. You will use an 'isBST()' method, which takes the maximum and minimum range of the values of the nodes.
 */

/**
 * CODE
 */

class TreeNode1 {
    int val;
    TreeNode1 left, right;

    public TreeNode1(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinaryTree1 {
    TreeNode1 root;

    public boolean isBST(TreeNode1 node, int min, int max) {
        if (node == null) return true;

        if (node.val < min || node.val > max) return false;

        return isBST(node.left, min, node.val - 1) && isBST(node.right, node.val + 1, max);
    }
}

public class Q06 {
    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        boolean isBST = tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("Is the tree a BST? " + isBST);
    }
}

/**
 * OUTPUT
 * 
 * Is the tree a BST? true
 */