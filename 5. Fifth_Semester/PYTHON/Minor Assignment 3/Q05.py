'''
Ques 5: Write a function that takes a positive integer and returns the number of digits.
'''

def count_digits(num):
    count = 0
    while(num > 0):
        num //= 10
        count += 1
    return count

print(count_digits(224101))