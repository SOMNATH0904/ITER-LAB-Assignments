n = 6

for i in range(n):
    for j in range(n-i):
        print(j, end=' ')
    print()

'''
Output ->
0 1 2 3 4 5 
0 1 2 3 4 
0 1 2 3
0 1 2
0 1
0
'''