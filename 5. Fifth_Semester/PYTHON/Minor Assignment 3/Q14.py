'''
Ques 14: Write a function to determine if a given number is an Armstrong number. (An Armstrong number is
a number that is equal to the sum of its digits, each raised to the power of the number of digits, e.g.,
153 = 13 + 53 + 33, 1634 = 14 + 64 + 34 + 44).
'''

def is_armstrong(number):
    digits = list(map(int, str(number)))
    num_digits = len(digits)
    armstrong_sum = sum(d ** num_digits for d in digits)
    return armstrong_sum == number


number = int(input("Enter a number: "))
if is_armstrong(number):
    print(f"{number} is an Armstrong number.")
else:
    print(f"{number} is not an Armstrong number.")
