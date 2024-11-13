'''
Ques 11: Write a Python program to print M-by-N list in the tabular format.
'''

def print_table(m, n):
    table = [[f"({i+1},{j+1})" for j in range(n)] for i in range(m)]
    
    for row in table:
        print("\t".join(str(cell) for cell in row))

m = int(input("Enter the number of rows (M): "))
n = int(input("Enter the number of columns (N): "))
print_table(m, n)
