'''
Ques 13. Write a function that receives a list of words, then determines and displays in alphabetical order only
the unique words. Treat uppercase and lowercase letters as the same. The function should use a set to
get the unique words in the list. Test your function with several sentences.
1
Centre for Data Science
Institute of Technical Education & Research, SOA, Deemed to be University
'''

def unique_words(sentence):
    words = sentence.lower().split()
    unique = sorted(set(words))
    return unique

sentence = input("Enter a sentence: ")
print("Unique words in alphabetical order:", unique_words(sentence))

'''
Output ->
Enter a sentence: Contributions are welcome! If you have any suggestions or find any issues, please feel free to open an issue or a pull request.
Unique words in alphabetical order: ['a', 'an', 'any', 'are', 'contributions', 'feel', 'find', 'free', 'have', 'if', 'issue', 'issues,', 'open', 'or', 'please', 'pull', 'request.', 'suggestions', 'to', 'welcome!', 'you']
'''