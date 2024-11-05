'''
Ques 29: Write a function to check if a given number is a perfect number. (A number is called a perfect number
if it is equal to the sum of its real divisors, e.g., 6=1+2+3, 28=1+2+4+7+14).
'''

def is_perfect_number(num):
    if num <= 1:
        return False
    sum_of_divisors = 0
    for i in range(1, num):
        if num % i == 0:
            sum_of_divisors += i
    return sum_of_divisors == num


number = int(input("Enter a number: "))
if is_perfect_number(number):
    print(f"{number} is a perfect number.")
else:
    print(f"{number} is not a perfect number.")
