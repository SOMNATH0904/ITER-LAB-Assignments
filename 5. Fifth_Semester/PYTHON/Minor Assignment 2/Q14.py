roomRates = {
    "standard": 100,
    "Deluxe": 150,
    "Suite": 250
}

roomType= input("Enter Room type :")
nights = int(input("Enter number of nights :"))
season = input("Enter season (peak, off, regular) :").lower()
loyaltyMember = input("Are you a loyalty member ? (Yes/No) :").lower()

baseCost = roomRates[roomType] * nights

if(nights > 7):
    discount = 0.20
elif(nights > 3):
    discount = 0.10
else:
    discount = 0.0

if(season == 'peak'):
    seasonAdj = 0.20
elif(season == 'off'):
    seasonAdj = -0.15
else:
    seasonAdj = 0.0

if(loyaltyMember == 'yes'):
    loyaltyDiscount = 0.05
else:
    loyaltyDiscount = 0.0

finalCost = baseCost * (1-discount) * (1+seasonAdj) * (1-loyaltyDiscount)
print("Final booking cost : $", finalCost)
