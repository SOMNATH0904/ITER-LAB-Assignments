'''
Ques 17: Create a function that takes a string and returns a new string where all the vowels are removed.
'''

def remove_vowels(s):
    vowels = "aeiouAEIOU"
    return ''.join(char for char in s if char not in vowels)


text = input("Enter a string: ")
print("String without vowels:", remove_vowels(text))
