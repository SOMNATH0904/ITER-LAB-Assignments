'''
Ques 23: Write a function that returns the index of each vowel in a string using a for loop.
'''

def vowel_indices(s):
    vowels = "aeiouAEIOU"
    indices = []
    for index, char in enumerate(s):
        if char in vowels:
            indices.append(index)
    return indices


text = input("Enter a string: ")
print("Indices of vowels:", vowel_indices(text))
