'''15. Write a Python program to print the substrings of a character having a particular frequency. For
 ’aabbbccccddddd’, you should print ’bbb’ if particular frequency is 3.'''
 
def print_substrings_by_frequency(s, freq):
    for i in range(len(s)):
        substring = s[i:i+freq]
        if len(substring) == freq and len(set(substring)) == 1:
            print(substring)

print_substrings_by_frequency("aabbbccccddddd", 3)  # Output: bbb