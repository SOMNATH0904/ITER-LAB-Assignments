'''18. What will be the output of executing each of the following statements after assigning the variable:
 quote = "The quick brown fox jumps over the lazy dog"
 (a) quote.upper()
 (b) quote[::-1]
 (c) quote[4:19]
 (d) quote.replace(’fox’, ’cat’)
 (e) quote.count(’o’)
 (f) quote.startswith(’The’)
 (g) ’brown’ in quote
 (h) quote.islower()'''
 
quote = "The quick brown fox jumps over the lazy dog"

# (a) Converts all characters to uppercase
print(quote.upper())  # Output: "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"

# (b) Reverses the string
print(quote[::-1])  # Output: "god yzal eht revo spmuj xof nworb kciuq ehT"

# (c) Extracts the substring from index 4 to 19
print(quote[4:19])  # Output: "quick brown fox"

# (d) Replaces 'fox' with 'cat'
print(quote.replace('fox', 'cat'))  # Output: "The quick brown cat jumps over the lazy dog"

# (e) Counts the number of occurrences of 'o'
print(quote.count('o'))  # Output: 4

# (f) Checks if the string starts with 'The'
print(quote.startswith('The'))  # Output: True

# (g) Checks if 'brown' is in the string
print('brown' in quote)  # Output: True

# (h) Checks if all characters are lowercase
print(quote.islower())  # Output: False