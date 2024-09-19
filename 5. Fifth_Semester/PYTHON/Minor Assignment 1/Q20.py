'''
Ques 20: Create a program that reads two integers, a and b, from the user. Your program should compute and
display:
• The sum of a and b
• The difference when b is subtracted from a
• The product of a and b
• The quotient when a is divided by b
• The remainder when a is divided by b
• The result of log10 a
• The result of ab
Hint: You will probably find the log10 function in the math module helpful for computing the
second last item in the list.
'''

import math

a = int(input("Enter the first integer (a): "))
b = int(input("Enter the second integer (b): "))

sum_ab = a + b
difference = a - b
product = a * b
quotient = a / b
remainder = a % b
log_a = math.log10(a)
power_ab = a ** b

print("Sum :", sum_ab)
print("Difference :", difference)
print("Product :", product)
print("Quotient :", quotient)
print("Remainder :", remainder)
print("log10(a) :", log_a)
print("a^b :", power_ab)

'''
Output ->
Enter the first integer (a): 4 
Enter the second integer (b): 5
Sum : 9
Difference : -1
Product : 20
Quotient : 0.8
Remainder : 4
log10(a) : 0.6020599913279624
a^b : 1024
'''

