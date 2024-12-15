'''
Ques 18. You are given two lists of integers: list1 and list2. Write a Python function analyze sets(list1,
list2) that performs the following tasks:
• Creates two sets, set1 and set2, from list1 and list2.
• Finds the symmetric difference of set1 and set2 (elements that are in either set, but not both).
• For each element in the symmetric difference:
– If the element is even, multiply it by 2.
– If the element is odd, add 5 to it.
• Return a sorted list of the modified elements.
'''

def analyze_sets(list1, list2):
    set1, set2 = set(list1), set(list2)
    sym_diff = set1 ^ set2
    modified = [(x * 2 if x % 2 == 0 else x + 5) for x in sym_diff]
    return sorted(modified)

list1 = [1, 2, 3, 4]
list2 = [3, 4, 5, 6]
print(analyze_sets(list1, list2))

'''
Output ->
[4, 6, 10, 12]
'''