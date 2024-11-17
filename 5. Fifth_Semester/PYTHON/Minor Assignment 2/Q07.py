rangePrime = int(input("Enter a Number :"))
sumPrimes = 0

for i in range(2, rangePrime):
    isPrime = True
    for n in range(2, int(i**0.5)+1):
        if i % n == 0:
            isPrime = False
            break
    
    if isPrime:
        sumPrimes += i

print(f"The Sum of all the prime numbers less than {rangePrime} is {sumPrimes}")