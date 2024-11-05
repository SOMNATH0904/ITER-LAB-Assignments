'''
Ques 21: Write a function to calculate the factorial of a number using a loop.
'''

def factorial(n):
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result


num = int(input("Enter a number: "))
print("Factorial:", factorial(num))
