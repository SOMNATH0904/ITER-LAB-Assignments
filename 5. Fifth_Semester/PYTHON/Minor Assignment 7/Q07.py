'''7. Write a Python program that checks if a string is a ”rotational palindrome.” A rotational palindrome
 is a string that can be rearranged cyclically to form a palindrome.'''
 
def is_rotational_palindrome(s):
    def is_palindrome(st):
        return st == st[::-1]
    return any(is_palindrome(s[i:] + s[:i]) for i in range(len(s)))

print(is_rotational_palindrome("aab"))  # Output: True
print(is_rotational_palindrome("abc"))  # Output: False