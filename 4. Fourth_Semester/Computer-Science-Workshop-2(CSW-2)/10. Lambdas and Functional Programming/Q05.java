/**
 * Ques 5 : Write a program that reads a list of strings, converts them to uppercase, filters out the strings starting with a vowel, and then prints the remaining strings.
 */

/**
 * CODE
 */

import java.util.ArrayList;
import java.util.List;

interface StringPredicate {
    boolean test(String str);
}

public class Q05 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("Banana");
        strings.add("orange");
        strings.add("kiwi");
        strings.add("Pineapple");

        List<String> filteredStrings = filterStrings(strings, str -> !startsWithVowel(str));
        printStrings(filteredStrings);
    }

    public static List<String> filterStrings(List<String> strings, StringPredicate predicate) {
        List<String> filtered = new ArrayList<>();
        for (String str : strings) {
            if (predicate.test(str)) {
                filtered.add(str.toUpperCase());
            }
        }
        return filtered;
    }

    public static boolean startsWithVowel(String str) {
        String firstLetter = str.substring(0, 1).toUpperCase();
        return firstLetter.matches("[AEIOU]");
    }

    public static void printStrings(List<String> strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }
}


/**
 * OUTPUT
 * 
 * BANANA
 * KIWI
 * PINEAPPLE
 */