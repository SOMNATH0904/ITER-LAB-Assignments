while True:
    user = input("Enter two numbers and an operator (+, -, *, /) seperated by spaces, or type 'exit' to quit :")
    if(user.lower() == 'exit'):
        print("Exit from the Calculator!!")
        break
    n1, n2, operator = user.split()
    n1 = float(n1)
    n2 = float(n2)

    if(operator == '+'):
        res = n1 + n2
    elif(operator == '-'):
        res = n1 - n2
    elif(operator == '*'):
        res = n1 * n2
    elif(operator == '/'):
        if(n2 != 0):
            res = n1 / n2
        else:
            res = "Error: Division by Zero is not allowed"
    else:
        res = "Error: Invalid Operator !!"

print(f"Result is : {res}")