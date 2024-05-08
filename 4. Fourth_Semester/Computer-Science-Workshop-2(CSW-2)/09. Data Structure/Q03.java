/**
 * Ques 3 : Create a class Country containing members for name and population, along with a constructor and necessary methods. Additionally, create a class BNode with a member 'info' to store a country object, 'left' to refer to the left child, and 'right' to refer to the right child. Provide the required constructor. Finally, create another class BST with a member 'root', along with the necessary constructor and a method to insert a node into the binary search tree.
 */

/**
 * CODE
 */

class Country {
    String name;
    int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
}

class BNode {
    Country info;
    BNode left;
    BNode right;

    public BNode(Country country) {
        this.info = country;
        this.left = null;
        this.right = null;
    }
}

class BST {
    BNode root;

    public BST() {
        this.root = null;
    }

    public void insert(Country country) {
        root = insertRec(root, country);
    }

    private BNode insertRec(BNode node, Country country) {
        if (node == null) {
            node = new BNode(country);
            return node;
        }

        if (country.name.compareTo(node.info.name) < 0) {
            node.left = insertRec(node.left, country);
        } else if (country.name.compareTo(node.info.name) > 0) {
            node.right = insertRec(node.right, country);
        }

        return node;
    }

    public void inOrderTraversal(BNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.info.name + ": Population - " + node.info.population);
            inOrderTraversal(node.right);
        }
    }
}

public class Q03 {
    public static void main(String[] args) {
        BST bst = new BST();

        Country usa = new Country("USA", 3280);
        Country china = new Country("China", 13980);
        Country india = new Country("India", 136600);
        Country brazil = new Country("Brazil", 21100);
        Country russia = new Country("Russia", 145000);

        bst.insert(usa);
        bst.insert(china);
        bst.insert(india);
        bst.insert(brazil);
        bst.insert(russia);

        System.out.println("Countries in alphabetical order:");
        bst.inOrderTraversal(bst.root);
    }
}

/**
 * OUTPUT
 * 
 * Countries in alphabetical order:
 * Brazil: Population - 21100
 * China: Population - 13980
 * India: Population - 136600
 * Russia: Population - 145000
 * USA: Population - 3280
 */