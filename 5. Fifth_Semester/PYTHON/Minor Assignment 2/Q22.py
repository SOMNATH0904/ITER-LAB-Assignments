n = int(input("Enter a Positive Integer :"))

def sumDigits(n):
    total = 0
    while(n > 0):
        total += n % 10
        n //= 10
    return total

while(n >= 10):
    n = sumDigits(n)
    
print("The Single digit sum is :", n)