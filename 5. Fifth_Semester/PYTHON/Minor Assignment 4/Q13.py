'''
Ques 13: Write a Python function that sorts a list of tuples based on the second element of each tuple.
'''

def sort_by_second_element(tuples):
    return sorted(tuples, key=lambda x: x[1])

# Example usage
tuples = [(1, 5), (2, 2), (3, 8), (4, 1)]
sorted_tuples = sort_by_second_element(tuples)
print(sorted_tuples)
