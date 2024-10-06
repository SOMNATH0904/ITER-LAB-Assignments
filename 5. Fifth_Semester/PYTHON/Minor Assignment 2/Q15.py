def isPerfectNumber(n):
    sumDivisors = 0
    for i in range(1, n):
        if(n % i == 0):
            sumDivisors += i
    return sumDivisors == n

num = int(input("Enter a Natural number :"))
if(isPerfectNumber(num)):
    print(f"{num} is a Perfect Number")
else:
    print(f"{num} is not a Perfect Number")
