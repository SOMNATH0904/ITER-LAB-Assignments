'''9. Create a program to find the number of vowels and consonants in a string.'''

def count_vowels_consonants(s):
    vowels = "aeiouAEIOU"
    vowels_count = sum(1 for char in s if char in vowels)
    consonants_count = sum(1 for char in s if char.isalpha() and char not in vowels)
    return vowels_count, consonants_count

print(count_vowels_consonants("Hello World"))  # Output: (3, 7)