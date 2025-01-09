''' 19. Examinethefollowingstring: quote = ’Knowledge is power. Power is gained through
 knowledge.’ What will be the output for the following function calls:
 (a) quote.find(’power’)
 (b) quote.rfind(’knowledge’)
 (c) quote.title()
 (d) quote.lower()
 (e) quote.upper()
 (f) quote.endswith(’knowledge.’)
 (g) quote.split(’ ’)
 (h) quote.partition(’is’)
 (i) quote.isalpha()'''
 
quote = "Knowledge is power. Power is gained through knowledge."

# (a) Finds the first occurrence of 'power'
print(quote.find('power'))  # Output: 13

# (b) Finds the last occurrence of 'knowledge'
print(quote.rfind('knowledge'))  # Output: 44

# (c) Converts the first letter of each word to uppercase
print(quote.title())  # Output: "Knowledge Is Power. Power Is Gained Through Knowledge."

# (d) Converts all characters to lowercase
print(quote.lower())  # Output: "knowledge is power. power is gained through knowledge."

# (e) Converts all characters to uppercase
print(quote.upper())  # Output: "KNOWLEDGE IS POWER. POWER IS GAINED THROUGH KNOWLEDGE."

# (f) Checks if the string ends with 'knowledge.'
print(quote.endswith('knowledge.'))  # Output: True

# (g) Splits the string into a list of words
print(quote.split(' '))  # Output: ['Knowledge', 'is', 'power.', 'Power', 'is', 'gained', 'through', 'knowledge.']

# (h) Partitions the string at the first occurrence of 'is'
print(quote.partition('is'))  # Output: ('Knowledge ', 'is', ' power. Power is gained through knowledge.')

# (i) Checks if all characters are alphabetic (no spaces or punctuation)
print(quote.isalpha())  # Output: False