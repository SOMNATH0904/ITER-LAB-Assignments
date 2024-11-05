'''
Ques 1: Write a Python function to find the first, second and third greatest digit in a number.
Sample Number: 6328
Expected Output: 8, 6, 3
'''

def top_three_digits(num):
    first = second = third = -1
    while(num > 0):
        digit = num % 10
        num //= 10
        
        if(digit > first):
            third = second
            second = first
            first = digit
        elif(digit > second):
            third = second
            second = digit
        elif(digit > third):
            third = digit

    return first, second, third

num = 6328
print(top_three_digits(num))