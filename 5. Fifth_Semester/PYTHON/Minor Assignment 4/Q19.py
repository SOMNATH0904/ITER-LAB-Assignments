'''
Ques 19: Write a Python function to demonstrate the difference between shallow and deep copy of lists. For
Example:-
Original List: [[’Shallow’, 2, 3], [4, 5, 6]]
Shallow Copy: [[’Shallow’, 2, 3], [4, 5, 6]]
Deep Copy: [[1, 2, 3], [’Deep’, 5, 6]]
'''

import copy

original_list = [['Shallow', 2, 3], [4, 5, 6]]
shallow_copy = copy.copy(original_list)
deep_copy = copy.deepcopy(original_list)

original_list[0][0] = 'Changed'
print("Original List:", original_list)
print("Shallow Copy:", shallow_copy)
print("Original List:", original_list)
print("Deep Copy:", deep_copy)
print("Original List:", original_list)
