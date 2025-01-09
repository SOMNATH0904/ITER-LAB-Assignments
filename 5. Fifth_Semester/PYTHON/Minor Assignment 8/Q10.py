''' 10. Write a Python function that reads a file file1 and displays the number of words and the number of
 vowels in the file.'''
 
def count_words_and_vowels(filename):
    vowels = "aeiouAEIOU"
    word_count = 0
    vowel_count = 0
    
    try:
        with open(filename, 'r') as file:
            text = file.read()
            words = text.split()
            word_count = len(words)
            vowel_count = sum(1 for char in text if char in vowels)
        
        print(f"Number of words: {word_count}")
        print(f"Number of vowels: {vowel_count}")
    except FileNotFoundError:
        print(f"Error: The file '{filename}' does not exist.")

filename = 'file1.txt'
count_words_and_vowels(filename)