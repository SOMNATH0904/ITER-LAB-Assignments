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

'''
a) How many times does the filter operation call its lambda argument?
The filter function checks all 10 elements in the numbers list.
Answer: 10 times.
b) How many times does the map operation call its lambda argument?
After the filter operation, only the odd numbers [3, 7, 1, 9, 5] are passed to the map function.
The map function processes these 5 numbers.
Answer: 5 times.
c) If you reverse the filter and map operations, how many times does the map operation call its lambda argument?
Reversing the operations gives:

python
Copy code
list(filter(lambda x: x % 2 != 0, map(lambda x: x ** 2, numbers)))
First, the map operation applies x ** 2 to all 10 elements of numbers, producing [100, 9, 49, 1, 81, 16, 4, 64, 25, 36].
Then, the filter operation processes all 10 squared values to check if they are odd using x % 2 != 0.
Answer: The map operation is called 10 times.
'''