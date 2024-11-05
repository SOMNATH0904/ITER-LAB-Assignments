'''
Ques 4: Write a function that takes a string as input and returns the reversed string.
'''

def reverse_string(str):
    reverseStr = ""
    for i in range(len(str) - 1, -1, -1):
        reverseStr += str[i]
    return reverseStr

print(reverse_string("DevSom"))