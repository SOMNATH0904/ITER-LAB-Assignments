''' Write a function that takes a sentence as an input parameter and displays the number of words in the
 sentence.'''
 
def count_words(sentence):
    return len(sentence.split())

print(count_words("This is a sample sentence."))  # Output: 5