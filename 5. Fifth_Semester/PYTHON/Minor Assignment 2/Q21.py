n = int(input("Enter a Positive Integer: "))
fact = 1
i = 1

while fact < n:
    i += 1
    fact *= i

if fact == n:
    print(f"{n} is a factorial number ({i}!)")
else:
    print(f"{n} is not a factorial number")
