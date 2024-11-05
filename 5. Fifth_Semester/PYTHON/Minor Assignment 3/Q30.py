'''
Ques 30: Write a function that inputs a number and returns the product of digits of that number.
'''

def product_of_digits(num):
    product = 1
    for digit in str(num):
        product *= int(digit)
    return product


number = int(input("Enter a number: "))
print("Product of digits:", product_of_digits(number))
