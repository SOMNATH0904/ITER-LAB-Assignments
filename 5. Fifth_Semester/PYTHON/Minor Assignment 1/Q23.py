'''
Ques 23: Write a program that reads a four-digit integer from the user and displays the sum of its digits. For
example, if the user enters 3141 then your program should display 3 + 1 + 4 + 1 = 9.
'''

number = int(input("Enter a four-digit integer: "))

thousands = number // 1000
hundreds = (number % 1000) // 100
tens = (number % 100) // 10
ones = number % 10

sumDigits = thousands + hundreds + tens + ones

print(thousands, "+", hundreds, "+", tens, "+", ones, "=", sumDigits)


'''
Output ->
Enter a four-digit integer: 1234
1 + 2 + 3 + 4 = 10
'''
