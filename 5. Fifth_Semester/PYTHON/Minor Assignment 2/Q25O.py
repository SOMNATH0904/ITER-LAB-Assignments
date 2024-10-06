n = 5
for i in range(1, n+1):
    print(" " * (n-i), end='')
    for j in range(i, 0, -1):
        print(j, end='')
    for j in range(2, i+1):
        print(j, end='')
    print()

'''
Output ->
    1
   212
  32123
 4321234
543212345
'''