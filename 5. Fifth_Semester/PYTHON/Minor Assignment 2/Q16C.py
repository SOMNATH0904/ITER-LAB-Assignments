def sumSeries(n):
    totalSum = 0
    sign = 1
    for i in range(n):
        term = (2*i)+1
        totalSum += sign * term
        sign *= -1
    return totalSum

n = int(input("Enter the number of terms(n) :")) 
res = sumSeries(n)
print(f"Sum of series for n = {n} is : {res}")