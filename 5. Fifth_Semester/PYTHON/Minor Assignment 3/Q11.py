'''
Ques 11: Create a function that determines whether a string can be rearranged to form a palindrome.
'''

def can_form_palindrome(s):
    odd_chars = set()
    for char in s:
        if char in odd_chars:
            odd_chars.remove(char)
        else:
            odd_chars.add(char)
    return len(odd_chars) <= 1

s = "civic"
print(can_form_palindrome(s)) 
