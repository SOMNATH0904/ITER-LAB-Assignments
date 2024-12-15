'''
Ques 12. Write a program that uses a dictionary to determine and print the number of duplicate words in a
sentence. Treat uppercase and lowercase letters the same and assume there is no punctuation in the
sentence.
'''

sentence = input("Enter a sentence: ").lower()
words = sentence.split()
word_count = {word: words.count(word) for word in words}
duplicates = {word: count for word, count in word_count.items() if count > 1}
print("Duplicate words:", duplicates)

'''
Output ->
Enter a sentence: Contributions are welcome! If you have any suggestions or find any issues, please feel free to open an issue or a pull request.
Duplicate words: {'any': 2, 'or': 2}
'''