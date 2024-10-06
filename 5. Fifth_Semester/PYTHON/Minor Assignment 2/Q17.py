count = 0
num = 100

while(num <= 1000):
    if(num % 5 == 0 or num % 6 == 0):
        print(num, end=' ')
        count += 1
        if(count % 10 == 0):
            print()
    num += 1