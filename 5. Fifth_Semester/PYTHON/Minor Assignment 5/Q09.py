'''
Ques 9. Write a program to find the number of occurrences of each letter present in a given string., e.g.,
str=‘mississippi’⇒ {‘m’: 1, ‘i’: 4, ‘s’: 4, ‘p’: 2}
'''

string = input("Enter a string: ")
occurrences = {char: string.count(char) for char in string}
print(occurrences)

'''
Output ->
Enter a string: Hello, Its DevSom404
{'H': 1, 'e': 2, 'l': 2, 'o': 2, ',': 1, ' ': 2, 'I': 1, 't': 1, 's': 1, 'D': 1, 'v': 1, 'S': 1, 'm': 1, '4': 2, '0': 1}
'''