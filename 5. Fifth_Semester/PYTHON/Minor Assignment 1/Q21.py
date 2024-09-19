'''
Ques 21: Write a program that determines how quickly an object is travelling when it hits the ground. The user
will enter the height from which the object is dropped in meters (m). Because the object is dropped
its initial speed is 0 m/s. Assume that the acceleration due to gravity is 9.8m/s2. You can use the
formula vf=sqrt.(vi^2 + 2ad) to compute the final speed, vf , when the initial speed, vi, acceleration, a,
and distance, d, are known.
'''

import math

g = 9.8
height = float(input("Enter the height from which the object is dropped (in meters): "))
final_velocity = math.sqrt(2 * g * height)
print("The final velocity when the object hits the ground is :", round(final_velocity, 2), "m/s")


'''
Output ->
Enter the height from which the object is dropped (in meters): 12
The final velocity when the object hits the ground is : 15.34 m/s
'''