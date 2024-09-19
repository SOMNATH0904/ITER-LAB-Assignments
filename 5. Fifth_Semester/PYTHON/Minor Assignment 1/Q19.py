'''
Ques 19: The program that you create for this exercise will begin by reading the cost of a meal ordered at a
restaurant from the user. Then your program will compute the tax and tip for the meal. Use your local
tax rate when computing the amount of tax owing. Compute the tip as 18 percent of the meal amount
(without the tax). The output from your program should include the tax amount, the tip amount, and
the grand total for the meal including both the tax and the tip. Format the output so that all of the
values are displayed using two decimal places.
'''

TAX_RATE = 0.075
TIP_PERCENTAGE = 0.18

meal_cost = float(input("Enter the cost of the meal: Rs. "))

tax_amount = meal_cost * TAX_RATE
tip_amount = meal_cost * TIP_PERCENTAGE
grand_total = meal_cost + tax_amount + tip_amount

print("Tax amount: Rs.", tax_amount)
print("Tip amount: Rs.", tip_amount)
print("Grand total: Rs.", grand_total)


'''
Output->
Enter the cost of the meal: Rs. 120
Tax amount: Rs. 9.0
Tip amount: Rs. 21.599999999999998
Grand total: Rs. 150.6
'''