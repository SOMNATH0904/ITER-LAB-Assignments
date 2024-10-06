n = int(input("Enter a Positive Integer :"))

factors = []
divisor = 2

while(n > 1):
    while(n % divisor == 0):
        factors.append(divisor)
        n //= divisor
    divisor += 1
    
print("Smallest factors in Increasing order : ", factors)