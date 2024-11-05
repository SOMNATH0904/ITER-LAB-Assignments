'''
Ques 6: Define a function to check if a given string is a palindrome. Example: madam ⟲ madam, racecar ⟲
racecar.
'''

def is_palindrome(str):
    str = str.lower()
    st = 0
    end = len(str)-1

    while(st < end):
        if(str[st] != str[end]):
            return False
        st += 1
        end -= 1
    return True

print(is_palindrome("madam"))
print(is_palindrome("racecar"))
print(is_palindrome("hello"))