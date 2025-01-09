'''10. Write a script that reads a line of text as a string, tokenizes the string with the split method and outputs
 the tokens in reverse order. Use space characters as delimiters.'''
 
def reverse_tokens(text):
    tokens = text.split()
    return ' '.join(tokens[::-1])

print(reverse_tokens("This is a sample sentence"))  # Output: sentence sample a is This