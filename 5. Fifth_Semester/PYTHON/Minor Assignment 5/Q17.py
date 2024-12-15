'''
Ques 17. Using the sets {‘red’, ‘green’, ‘blue’}, and {‘cyan’, ‘green’, ‘blue’, ‘magenta’, ‘red’},
display the results of:
a) comparing the sets using each of the comparison operators.
b) combining the sets using each of the mathematical set operators.
'''

set1 = {"red", "green", "blue"}
set2 = {"cyan", "green", "blue", "magenta", "red"}

print("a) Comparison:")
print("Set1 is subset of Set2:", set1 <= set2)
print("Set2 is superset of Set1:", set2 >= set1)

print("b) Mathematical set operations:")
print("Union:", set1 | set2)
print("Intersection:", set1 & set2)
print("Difference:", set1 - set2)
print("Symmetric difference:", set1 ^ set2)

'''
Output ->
a) Comparison:
Set1 is subset of Set2: True
Set2 is superset of Set1: True
b) Mathematical set operations:
Union: {'red', 'blue', 'green', 'cyan', 'magenta'}
Intersection: {'red', 'blue', 'green'}
Difference: set()
Symmetric difference: {'magenta', 'cyan'}
'''