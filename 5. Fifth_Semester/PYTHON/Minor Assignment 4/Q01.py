'''
Ques 1: Write a Python program to create a list of size N and store the random values in it and find the sum
and average.
'''

from random import randrange as rr

def generate_random_list_and_calculate(n):
    random_list = [rr(1, 101) for _ in range(n)]
    total_sum = sum(random_list)
    average = total_sum / n if n > 0 else 0
    return random_list, total_sum, average

N = int(input("Enter the size of the list (N): "))
random_list, total_sum, average = generate_random_list_and_calculate(N)

print(f"Random List: {random_list}")
print(f"Sum: {total_sum}")
print(f"Average: {average}")
