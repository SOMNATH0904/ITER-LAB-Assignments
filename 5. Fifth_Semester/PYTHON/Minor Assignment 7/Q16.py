'''16. Write a code to extract unique characters of a string in sorted order.'''

def unique_sorted_chars(s):
    return ''.join(sorted(set(s)))

print(unique_sorted_chars("aabbbccccddddd"))  # Output: abcd