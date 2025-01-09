'''20. For string1 = ’Python Programming Language’, determine the patterns extracted by the following
 regular expressions:
 (a) match1 = re.search(’. m?’, string1)
 print(match1.group())
  (b) match3 = re.search(’.∗Language$’, string1)
 print(match3.group())
 (c) match4 = re.search(’ w∗ s w∗’, string1)
 print(match4.group())
 (d) match5 = re.search(’.∗’, string1)
 print(match5.group())'''
 
import re

string1 = "Python Programming Language"

# (a) Finds a pattern that matches any character followed by an optional 'm'
match1 = re.search('. m?', string1)
print(match1.group())  # Output: 'on'

# (b) Finds a pattern that matches any string ending with 'Language'
match3 = re.search('.*Language$', string1)
print(match3.group())  # Output: 'Python Programming Language'

# (c) Finds a pattern with any spaces between 'w' and 's'
match4 = re.search('w* s w*', string1)
print(match4.group())  # Output: 'w s'

# (d) Matches the entire string
match5 = re.search('.*', string1)
print(match5.group())  # Output: 'Python Programming Language'