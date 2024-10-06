user = int(input("Enter an Integer :"))
res = 1

while(user < 0):
    print("Please enter a Positive Integer !!")
    user = int(input("Enter an Integer :"))
    
if(user % 2 == 0):
    res = user * 2
else:
    res = user * user

print(f"The Entered number is {user} and the result is {res}")