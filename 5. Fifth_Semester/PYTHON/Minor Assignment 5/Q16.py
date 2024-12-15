'''
Ques 16. Given the sets {10, 20, 30} and {5, 10, 15, 20}, use the mathematical set operators to produce the
following sets: a) {30}, b) {5, 15, 30} c) {5, 10, 15, 20, 30} d) {10, 20}
'''

set1 = {10, 20, 30}
set2 = {5, 10, 15, 20}
print("a) Difference:", set1 - set2)
print("b) Symmetric difference:", set1 ^ set2)
print("c) Union:", set1 | set2)
print("d) Intersection:", set1 & set2)

'''
Output ->
a) Difference: {30}
b) Symmetric difference: {5, 30, 15}
c) Union: {20, 5, 10, 30, 15}
d) Intersection: {10, 20}
'''