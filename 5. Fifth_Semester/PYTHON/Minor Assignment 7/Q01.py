'''Write a function that takes a string as a parameter and returns a string with every successive repetitive
 character replaced with a star(*). For example, ’balloon’ is returned as ’bal*o*n’.'''
 
def replace_repeats(s):
    return ''.join(s[i] if i == 0 or s[i] != s[i - 1] else '*' for i in range(len(s)))

print(replace_repeats("balloon"))  # Output: bal*o*n