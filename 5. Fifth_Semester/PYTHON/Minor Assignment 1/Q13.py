'''
Ques 13: Write a program that reads a positive integer, n, from the user and then displays the sum of all of
the integers from 1 to n. The sum of the first n positive integers can be computed using the formula:
sum = (n)(n+1)/2
'''

n = int(input("Enter a positive integer: "))

if n > 0:
    total_sum = n * (n + 1) / 2
    print("The sum of all integers from 1 to", n, "is :", total_sum)
else:
    print("Please enter a positive integer.")


# Output: Enter a positive integer: 12
# The sum of all integers from 1 to 12 is : 78.0