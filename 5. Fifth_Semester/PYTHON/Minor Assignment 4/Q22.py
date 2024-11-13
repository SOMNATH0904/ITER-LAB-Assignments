'''
Ques 22: When combining filter and map operations, the order in which they’re performed matters. Consider a
list numbers containing 10, 3, 7, 1, 9, 4, 2, 8, 5, 6 and the following code:
In [1]: numbers = [10, 3, 7, 1, 9, 4, 2, 8, 5, 6]
In [2]: list(map(lambda x: x * 2,
...: filter(lambda x: x % 2 == 0, numbers)))
...:
Out[3]: [20, 8, 4, 16, 12]
Reorder this code to call map first and filter second. What happens and why?
'''

numbers = [10, 3, 7, 1, 9, 4, 2, 8, 5, 6]
reversed_map = list(map(lambda x: x * 2, filter(lambda x: x % 2 == 0, numbers)))
print(f"Reversed map and filter output: {reversed_map}")
