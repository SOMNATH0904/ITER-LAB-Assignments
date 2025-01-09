''' 23. Given a string s and index i, write a python program to delete the i-th value from s.'''

def delete_char_at_index(s, i):
    return s[:i] + s[i+1:]

string = input("Enter a string: ")
index = int(input("Enter the index to delete: "))
print(delete_char_at_index(string, index))