'''
Ques 18: Write a Python program to create a new list that contains the square of every element in a given list
using list comprehension.
'''

original_list = [1, 2, 3, 4, 5]
squared_list = [x ** 2 for x in original_list]
print(squared_list)
