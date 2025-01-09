''' 5. Write a Python program to find the length of the longest word in a sentence.'''

def longest_word_length(sentence):
    return max(len(word) for word in sentence.split())

print(longest_word_length("Python programming is amazing"))  # Output: 11