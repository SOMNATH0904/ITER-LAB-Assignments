/**
 * Ques 2 : Write a program that sorts a list of strings based on their lengths in descending order. Define a custom comparator using a lambda expression that compares strings based on their lengths. Use the custom comparator to sort the list of strings in descending order of length.
 */

/**
 * CODE
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("banana");
        strings.add("apple");
        strings.add("cherry");
        strings.add("date");

        Comparator<String> lengthComparator = (str1, str2) -> Integer.compare(str2.length(), str1.length());

        Collections.sort(strings, lengthComparator);

        System.out.println("Sorted strings by length(Descending Order): "+strings);
    }
}

/**
 * OUTPUT
 * 
 * Sorted strings by length (descending order): [banana, cherry, apple, date]
 */