'''
Ques 28: Write a function that takes a string of lowercase alphabets as inputs and gives an output by shifting
them by one letter ahead. Note that if the string has ’z’, then it will be treated as ’a’. Example: python
7→ qzuipo, pythonzabc 7→ qzuipobbcd.
'''

def shift_string(s):
    result = ""
    for char in s:
        if char == 'z':
            result += 'a'
        else:
            result += chr(ord(char) + 1)
    return result


input_string = input("Enter a string of lowercase alphabets: ")
print("Shifted string:", shift_string(input_string))
