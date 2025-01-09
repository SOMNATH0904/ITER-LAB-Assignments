'''  7. Write a Python program that counts the number of words in a given text file.
 Input file, sample.txt contains,
 Python is a versatile programming language.
 It is widely used in data science, web development, and automation.
 Output: The file ’sample.txt’ contains 16 words.'''
 
def count_words_in_file(filename):
    with open(filename, 'r') as file:
        text = file.read()
    words = text.split()
    return len(words)

filename = 'sample.txt'
print(f"The file '{filename}' contains {count_words_in_file(filename)} words.")

