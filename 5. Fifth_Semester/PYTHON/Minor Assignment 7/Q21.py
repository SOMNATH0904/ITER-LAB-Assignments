''' 21. For string1 = ’Python Programming Language’, find the corresponding outputs.
 (a) match1 = re.fullmatch(r’[A-Za-z]*’, string1)
 print(match1.group())
 (b) match2 = re.sub(r’Programming’, ’Coding’, string1)
 print(match2)
 (c) match3 = re.split(r’\s+’, string1)
 print(match3)
 (d) match8 = re.findall(r’\w+’, string1)
 print(match8)'''
 
import re

string1 = "Python Programming Language"

# (a) Checks if the entire string consists of only letters
match1 = re.fullmatch(r'[A-Za-z]*', string1)
# Output will be None since there are spaces and uppercase letters (not only lowercase or uppercase letters)
if match1:
    print(match1.group())
else:
    print("No match")  # Output: No match

# (b) Replaces 'Programming' with 'Coding'
match2 = re.sub(r'Programming', 'Coding', string1)
print(match2)  # Output: 'Python Coding Language'

# (c) Splits the string by one or more whitespace characters
match3 = re.split(r'\s+', string1)
print(match3)  # Output: ['Python', 'Programming', 'Language']

# (d) Finds all words (alphanumeric sequences)
match8 = re.findall(r'\w+', string1)
print(match8)  # Output: ['Python', 'Programming', 'Language']