import math

def sumSeries(x, n):
    total = 1
    for i in range(1, n + 1):
        term = ((-1) ** i) * (x ** (2 * i)) / math.factorial(2 * i)
        total += term
    return total

x = float(input("Enter value of x :"))
n = int(input("Enter the number of terms(n) :")) 
res = sumSeries(x, n)
print(f"Sum of series for x = {x} and n = {n} is : {res}")
