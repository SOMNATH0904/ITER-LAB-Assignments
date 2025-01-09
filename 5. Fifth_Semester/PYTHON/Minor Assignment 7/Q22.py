'''22. Write a python program to check if a string is symmetric or asymmetric.'''

def check_symmetric(s):
    return s == s[::-1]

string = input("Enter a string: ")
if check_symmetric(string):
    print("Symmetric")
else:
    print("Asymmetric")