'''
Ques 7. Use dictionary comprehension to create a dictionary of the numbers 1–5 mapped to their cubes.
'''

cubes = {x: x**3 for x in range(1, 6)}
print(cubes)

'''
Output ->
{1: 1, 2: 8, 3: 27, 4: 64, 5: 125}
'''