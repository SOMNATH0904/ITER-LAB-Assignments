import math

def sumSeries(x, n):
    totalSum = 1
    for i in range(1, n+1):
        term = (x ** i) / math.factorial(i)
        totalSum += term
    return totalSum
    
x = float(input("Enter value of x :"))
n = int(input("Enter the number of terms(n) :")) 
res = sumSeries(x, n)
print(f"Sum of series for x = {x} and n = {n} is : {res}")