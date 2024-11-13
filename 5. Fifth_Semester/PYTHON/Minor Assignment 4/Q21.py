'''
Ques 21: With regard to the following code:
numbers = [10, 3, 7, 1, 9, 4, 2, 8, 5, 6]
list(map(lambda x: x ** 2, filter(lambda x: x % 2 != 0, numbers)))
a) How many times does the filter operation call its lambda argument?
b) How many times does the map operation call its lambda argument?
c) If you reverse the filter and map operations, how many times does the map operation call its lambda
argument?
'''

numbers = [10, 3, 7, 1, 9, 4, 2, 8, 5, 6]
filtered = list(filter(lambda x: x % 2 != 0, numbers))
mapped = list(map(lambda x: x ** 2, filtered))
print(f"Filtered List: {filtered}, Mapped List: {mapped}")
