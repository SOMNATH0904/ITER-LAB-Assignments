user = input("Enter an Integer :")
number = int(user)
remainder = number % 5

match remainder:
    case 0: print(f"The remainder when {number} is divided by 5 is 0.")
    case 1: print(f"The remainder when {number} is divided by 5 is 1.")
    case 2: print(f"The remainder when {number} is divided by 5 is 2.")
    case 3: print(f"The remainder when {number} is divided by 5 is 3.")
    case 4: print(f"The remainder when {number} is divided by 5 is 4.")
    case _: print("Invalid Input!!")