''' 6. Write a Python function that takes a string and returns a new string where every vowel in the input
 string is replaced by the next vowel in sequence (a → e, e → i, i → o, o → u, u → a).'''
 
def replace_vowels(s):
    vowels = "aeiou"
    return ''.join(vowels[(vowels.index(c) + 1) % 5] if c in vowels else c for c in s)

print(replace_vowels("hello world"))  # Output: hilli wurld