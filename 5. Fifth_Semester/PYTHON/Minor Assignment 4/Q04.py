'''
Ques 4: Write a Python program that removes all occurrences of a specific element from a list.
'''

def remove_all_occurrences(lst, element):
    return [x for x in lst if x != element]

lst = [int(x) for x in input("Enter the list elements separated by space: ").split()]
element_to_remove = int(input("Enter the element to remove: "))

new_list = remove_all_occurrences(lst, element_to_remove)

print("List after removing all occurrences of", element_to_remove, ":", new_list)
