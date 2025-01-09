'''11. Write a script that reads a line of text, tokenizes the line using space characters as delimiters and
 outputs only those words beginning with the letter ’b’ and ending with the letter ’d’.'''
 
def words_start_end_b_d(text):
    tokens = text.split()
    return [word for word in tokens if word.startswith('b') and word.endswith('d')]

print(words_start_end_b_d("bored bird bold brand build bad"))  # Output: ['bored', 'bold', 'bad']