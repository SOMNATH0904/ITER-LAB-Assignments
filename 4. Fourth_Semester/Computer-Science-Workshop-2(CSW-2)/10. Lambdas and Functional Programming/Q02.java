/**
 * Ques 2 : Write a program that sorts a list of strings based on their lengths in descending order. Define a custom comparator using a lambda expression that compares strings based on their lengths. Use the custom comparator to sort the list of strings in descending order of length.
 */

/**
 * CODE
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface StringComparator {
    int compare(String s1, String s2);
}

public class Q02 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("grape");
        strings.add("kiwi");

        StringComparator lengthComparator = (s1, s2) -> Integer.compare(s2.length(), s1.length());

        Collections.sort(strings, (s1, s2) -> lengthComparator.compare(s1, s2));

        System.out.println("Sorted list in descending order of length:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}


/**
 * OUTPUT
 * 
 * Sorted list in descending order of length:
 * banana
 * orange
 * apple
 * grape
 * kiwi
 */