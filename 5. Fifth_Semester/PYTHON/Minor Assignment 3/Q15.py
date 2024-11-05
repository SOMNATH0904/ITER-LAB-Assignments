'''
Ques 15: Create a function that returns the nth number in the Fibonacci sequence.
'''

def fibonacci(n):
    if n <= 0:
        return "Input should be a positive integer."
    elif n == 1:
        return 0
    elif n == 2:
        return 1
    
    a, b = 0, 1
    for _ in range(2, n):
        a, b = b, a + b
    return b


n = int(input("Enter the position (n) in the Fibonacci sequence: "))
print(f"The {n}th Fibonacci number is:", fibonacci(n))
