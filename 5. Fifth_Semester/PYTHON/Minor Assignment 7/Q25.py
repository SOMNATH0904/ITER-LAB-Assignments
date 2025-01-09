'''25. Use regular expressions and the findall function to count the number of digits, non-digit characters,
 whitespace characters and words in a string.'''
 
import re

def count_characters(s):
    digits = len(re.findall(r'\d', s))
    non_digits = len(re.findall(r'\D', s))
    whitespaces = len(re.findall(r'\s', s))
    words = len(re.findall(r'\b\w+\b', s))

    return digits, non_digits, whitespaces, words

string = input("Enter a string: ")
digits, non_digits, whitespaces, words = count_characters(string)

print(f"Digits: {digits}")
print(f"Non-digit characters: {non_digits}")
print(f"Whitespace characters: {whitespaces}")
print(f"Words: {words}")