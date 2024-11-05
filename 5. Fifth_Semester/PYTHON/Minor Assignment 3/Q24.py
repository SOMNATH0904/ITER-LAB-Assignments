'''
Ques 24: Write a function that removes all punctuation from a string.
'''

def remove_punctuation(s):
    punctuation = '''!()-[]{};:'"\,<>./?@#$%^&*_~'''
    result = ""
    for char in s:
        if char not in punctuation:
            result += char
    return result


text = input("Enter a string: ")
print("String without punctuation:", remove_punctuation(text))
