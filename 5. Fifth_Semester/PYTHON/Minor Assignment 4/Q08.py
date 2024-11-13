'''
Ques 8: Write a function that takes n as an input and creates a list of n lists such that ith list contains the first
five multiples of i.
'''

def cumulative_sum(numbers):
    cumulative_list = []
    total = 0
    for num in numbers:
        total += num
        cumulative_list.append(total)
    return cumulative_list

numbers = [int(x) for x in input("Enter numbers separated by space: ").split()]
result = cumulative_sum(numbers)
print("Cumulative list:", result)
