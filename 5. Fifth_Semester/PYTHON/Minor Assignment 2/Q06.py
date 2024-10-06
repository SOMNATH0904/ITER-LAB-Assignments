num = int(input("Enter an Integer :"))

if(num < 2):
    print(f"{num} is not a Prime Number")
else:
    isPrime = True
    for i in range(2, num):
        if(num % i == 0):
            isPrime = False
            break
    
    if isPrime:
        print(f"{num} is a Prime number")
    else:
        print(f"{num} is not a Prime number")