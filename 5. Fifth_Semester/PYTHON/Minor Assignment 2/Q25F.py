n = 4

for i in range(1, n+1):
    for j in range(n-i):
        print(" ", end="")
    for k in range(i):
        print("* ", end="")
    print()

for i in range(n-1, 0, -1):
    for j in range(n-i):
        print(" ", end="")
    for k in range(i):
        print("* ", end="")
    print()

'''
Output ->
   * 
  * * 
 * * *
* * * *
 * * *
  * *
   *
'''