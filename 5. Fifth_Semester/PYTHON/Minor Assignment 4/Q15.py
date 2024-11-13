'''
Ques 15: Write a Python program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix, and
finds the first row and column with the most 1s. Here is a sample run of the program:
0011
0011
1101
1010
The largest row index: 2
The largest column index: 2
'''

import random

matrix = [[random.choice([0, 1]) for _ in range(4)] for _ in range(4)]
for row in matrix:
    print(''.join(map(str, row)))

max_row = max(range(4), key=lambda r: sum(matrix[r]))
max_col = max(range(4), key=lambda c: sum(matrix[r][c] for r in range(4)))

print(f"The largest row index: {max_row}")
print(f"The largest column index: {max_col}")
