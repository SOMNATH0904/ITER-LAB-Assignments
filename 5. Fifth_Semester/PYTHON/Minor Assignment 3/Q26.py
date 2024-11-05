'''
Ques 26: Write a function that replaces all vowels in a string with the character ”*”.
'''

def replace_vowels(s):
    vowels = "aeiouAEIOU"
    result = ""
    for char in s:
        if char in vowels:
            result += "*"
        else:
            result += char
    return result


text = input("Enter a string: ")
print("String with vowels replaced:", replace_vowels(text))
