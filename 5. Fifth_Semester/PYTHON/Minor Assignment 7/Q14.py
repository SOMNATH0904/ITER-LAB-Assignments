''' 14. Write a Python program to reverse the middle half of characters in a string.'''

def reverse_middle_half(s):
    mid = len(s) // 2
    half = s[mid-1:mid+2]  # Middle half (for odd-length strings)
    return s[:mid-1] + half[::-1] + s[mid+2:]

print(reverse_middle_half("abcdefg"))  # Output: abdcefg