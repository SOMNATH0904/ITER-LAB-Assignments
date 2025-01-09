'''12. Write a script that reads a five-letter word from the user and produces every possible three-letter
 string, based on the word’s letters. For example, the three-letter words produced from the word
 “bathe” include “ate,” “bat,” “bet,” “tab,” “hat,” “the,” and “tea.” Challenge: Investigate the functions
 from the itertools module, then use an appropriate function to automate this task.'''
 
import itertools

def generate_three_letter_words(word):
    return [''.join(comb) for comb in itertools.permutations(word, 3)]

word = input("Enter a five-letter word: ")
print(generate_three_letter_words(word))