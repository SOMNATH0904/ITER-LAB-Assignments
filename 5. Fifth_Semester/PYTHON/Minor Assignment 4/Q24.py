'''
Ques 24. Given a list of tuples, remove all the tuples with length K, where K is user-defined.
'''

def remove_tuples_of_length(lst, k):
    return [tup for tup in lst if len(tup) != k]

tuples = [(1, 2), (3, 4), (5, 6, 7), (8, 9)]
k = int(input("Enter the length K to remove tuples of that length: "))
filtered_tuples = remove_tuples_of_length(tuples, k)
print("Filtered Tuples:", filtered_tuples)
