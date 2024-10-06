totalCash = 10000
amount = int(input("Enter the amount you want to withdraw :"))

if(amount % 10 != 0):
    print("The amount must be a multiple of 10")
else:
    if(amount > totalCash):
        print("The ATM is not having enough cash")
    else:
        notes100 = amount//100
        amount %= 100
        notes50 = amount//50
        amount %= 50
        notes20 = amount//20
        amount %= 20
        notes10 = amount//10

totalCash -= (notes100 * 100) + (notes50 * 50) + (notes20 * 20) + (notes10 * 10)
print("Dispensed Notes :")
if(notes100 > 0):
    print(f"100s: {notes100}")
if(notes50 > 0):
    print(f"50s: {notes50}")
if(notes20 > 0):
    print(f"20s: {notes20}")
if(notes10 > 0):
    print(f"10s: {notes10}")
print(f"Remaining Cash in ATM : {totalCash}")
