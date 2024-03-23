/**
 * Ques 6 : Write a program to create a TreeSet of Integer type and perform the below
 * operation on it.
 * (a.) Display the TreeSet
 * (b.) Ask the user to enter a number and search that number is it present in the
 * list or not.
 * (c.) Remove an element from tree.
 */

import java.util.Scanner;
import java.util.TreeSet;

public class Q06 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        System.out.println("TreeSet elements: " + treeSet);

        System.out.print("Enter a number to search: ");
        int num = scanner.nextInt();
        if (treeSet.contains(num)) {
            System.out.println(num + " is present in the TreeSet.");
        } else {
            System.out.println(num + " is not present in the TreeSet.");
        }

        System.out.print("Enter an element to remove: ");
        int removeNum = scanner.nextInt();
        if (treeSet.contains(removeNum)) {
            treeSet.remove(removeNum);
            System.out.println("Element " + removeNum + " removed from TreeSet.");
        } else {
            System.out.println("Element " + removeNum + " not found in the TreeSet.");
        }

        System.out.println("Updated TreeSet elements: " + treeSet);
    }
}

/**
 * OUTPUT :
 *
 * TreeSet elements: [10, 20, 30, 40, 50]
 * Enter a number to search: 20
 * 20 is present in the TreeSet.
 * Enter an element to remove: 50
 * Element 50 removed from TreeSet.
 * Updated TreeSet elements: [10, 20, 30, 40]
 */