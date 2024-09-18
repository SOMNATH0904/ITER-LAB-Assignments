'''
Ques 15: Assume you start investing in Mutual Funds with Rs. 1000 and plan to leave your money invested.
Calculate and display how much money you will have after 10, 20 and 30 years. Use the following
formula for determining these amounts:
a = p(1 + r)n
where p (principal) = Rs. 1000,
r (annual rate of return) = 12
n (number of years) = 10, 20, 30,
a (amount on deposit at the end of the nth year).
Disclaimer: Investing in Mutual Funds is subject to Market Risks. Do your due diligence before
investing.
'''

p = 1000
r = 0.12

amt10Yrs = p * (1 + r) ** 10
amt20Yrs = p * (1 + r) ** 20
amt30Yrs = p * (1 + r) ** 30

print("Amount after 10 years: Rs.", round(amt10Yrs, 2))
print("Amount after 20 years: Rs.", round(amt20Yrs, 2))
print("Amount after 30 years: Rs.", round(amt30Yrs, 2))


'''
Output ->
Amount after 10 years: Rs. 3105.85
Amount after 20 years: Rs. 9646.29
Amount after 30 years: Rs. 29959.92
'''