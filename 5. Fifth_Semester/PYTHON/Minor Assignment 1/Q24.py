'''
Ques 24: Write a program that reads three integers from the user and displays them in sorted order (from
smallest to largest). Use the min and max functions to find the smallest and largest values. The middle
value can be found by computing the sum of all three values, and then subtracting the minimum value
and the maximum value.
'''

a = int(input("Enter the first integer: "))
b = int(input("Enter the second integer: "))
c = int(input("Enter the third integer: "))

smallest = min(a, b, c)
largest = max(a, b, c)
middle = a + b + c - smallest - largest

print("Sorted Order:", smallest, middle, largest)


'''
Output ->
Enter the first integer: 34 
Enter the second integer: 98
Enter the third integer: 12
Sorted Order: 12 34 98
'''
