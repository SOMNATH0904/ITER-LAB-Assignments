import math

def sumSeries(x, n):
    total = 1
    for i in range(1, n + 1):
        total += (x ** i) / math.factorial(i)
    return total
    
x = float(input("Enter value of x :"))
n = int(input("Enter the number of terms(n) :")) 
res = sumSeries(x, n)
print(f"Sum of series for x = {x} and n = {n} is : {res}")