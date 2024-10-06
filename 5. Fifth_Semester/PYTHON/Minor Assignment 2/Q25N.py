n = 7
asciiVal = 65

for i in range(1, n+1):
    for j in range(i):
        print(chr(asciiVal), end='')
        asciiVal += 1
    print()

'''
Output ->
A
BC
DEF
GHIJ
KLMNO
PQRSTU
VWXYZ[\
'''