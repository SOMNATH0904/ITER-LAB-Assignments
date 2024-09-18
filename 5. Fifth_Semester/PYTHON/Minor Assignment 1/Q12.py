''' 
Ques 12: Write a program that begins by reading a radius, r, from the user. The program will continue by
computing and displaying the area of a circle with radius r and the volume of a sphere with radius r.
Use the pi constant in the math module in your calculations.
Hint: The area of a circle is computed using the formula area = πr2.
The volume of a sphere is computed using the formula volume = 4
3πr3.
'''

import math
r = float(input("Enter the radius: "))
areaCircle = math.pi * r**2
volumeSphere = (4/3) * math.pi * r**3

print("Area of the circle:", areaCircle)
print("Volume of the sphere: ", volumeSphere)


'''
Output ->
Enter the radius: 12.3
Area of the circle: 475.2915525615999
Volume of the sphere:  7794.781462010238
'''