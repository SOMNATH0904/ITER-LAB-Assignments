n = int(input("Enter a Positive Number :"))
reverseNo = 0

while(n > 0):
    digit = n % 10
    reverseNo = reverseNo * 10 + digit
    n //= 10

print("Reversed Number :", reverseNo)