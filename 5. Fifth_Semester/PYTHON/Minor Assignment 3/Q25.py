'''
Ques 25: Write a function to check if two numbers are coprime.
'''

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def are_coprime(num1, num2):
    return gcd(num1, num2) == 1


number1 = int(input("Enter the first number: "))
number2 = int(input("Enter the second number: "))

if are_coprime(number1, number2):
    print(f"{number1} and {number2} are coprime.")
else:
    print(f"{number1} and {number2} are not coprime.")
