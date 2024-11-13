'''
Ques 12: Define a function that returns the sum of all the elements in a specified column in a matrix. Write a
Python program that reads a 3-by-4 matrix and displays the sum of each column. Here is a sample
run:
Enter a 3-by-4 matrix row by row:
1.5 2 3 4
5.5 6 7 8
9.5 1 3 1
'''

def column_sum(matrix, col_index):
    return sum(row[col_index] for row in matrix)

matrix = []
print("Enter a 3-by-4 matrix row by row:")
for _ in range(3):
    row = list(map(float, input().split()))
    matrix.append(row)

for col in range(4):
    print(f"Sum of column {col + 1}: {column_sum(matrix, col)}")
