/**
 * Ques 5 : Write a program that reads a list of strings, converts them to uppercase, filters out the strings starting with a vowel, and then prints the remaining strings.
 */

/**
 * CODE
 */

import java.util.Arrays;
import java.util.List;

public class Q05 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "Orange", "kiwi", "peach");
        
        strings.stream()
                .map(String::toUpperCase)
                .filter(str -> !str.matches("[AEIOU].*"))
                .forEach(System.out::println);
    }
}

/**
 * OUTPUT
 * 
 * BANANA
 * KIWI
 * PEACH
 */