''' 2. Write a function that takes two strings and returns True if they are anagrams and False otherwise. A
 pair of strings is anagram if the letters in one word can be arranged to form the second one'''
 
def are_anagrams(s1, s2):
    return sorted(s1) == sorted(s2)

print(are_anagrams("listen", "silent"))  # Output: True
print(are_anagrams("hello", "world"))   # Output: False