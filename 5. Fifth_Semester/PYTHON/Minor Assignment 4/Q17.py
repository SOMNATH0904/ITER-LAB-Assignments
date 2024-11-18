'''
Ques 17: You can compute the standard deviation with the following formula; you have to store the individual
numbers using a list so that they can be used after the mean is obtained.
Write a Python program that prompts the user to enter ten numbers and displays the mean and standard
deviation, as shown in the following sample run:
Enter ten numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2
The mean is 3.11
The standard deviation is 1.55738.
'''

import math

nums = list(map(float, input("Enter ten numbers: ").split()))
print(nums)
mean = sum(nums) / len(nums)
variance = sum((x - mean) ** 2 for x in nums) / (len(nums) - 1)
std_dev = math.sqrt(variance)

print(f"The mean is {mean:.2f}")
print(f"The standard deviation is {std_dev:.5f}")
