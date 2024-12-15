'''
Ques 14. Create a program that determines and displays the number of unique characters in a string entered by
the user, e.g., Hello, World! has 10 unique characters, while zzz has only one unique character. Use
a dictionary or set to solve this problem.
'''

string = input("Enter a string: ")
unique_chars = set(string)
print("Number of unique characters:", len(unique_chars))

'''
Output ->
Enter a string: Hello I am Somnath
Number of unique characters: 12
'''