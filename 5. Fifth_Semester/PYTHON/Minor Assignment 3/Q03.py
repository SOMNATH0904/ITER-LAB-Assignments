'''
Ques 3: Write a Python function to add the squares of the even numbers between 1 and 50 (both included).
'''

def sum_squares_even():
    totalSum = 0
    for i in range(1, 51):
        if i % 2 == 0:
            totalSum += i ** 2  
    return totalSum

print(sum_squares_even())