'''
Ques 19: Create a function to find the greatest common divisor (GCD) of two numbers using a while loop.
'''

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a


num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))

print("The GCD is:", gcd(num1, num2))
