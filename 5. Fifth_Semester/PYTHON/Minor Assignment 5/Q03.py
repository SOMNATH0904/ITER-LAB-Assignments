'''
Ques 3. Write a program to take a user-input dictionary and print the sum of the values.
'''

user_dict = {}
n = int(input("Enter number of items: "))
for _ in range(n):
    key = input("Enter key: ")
    value = int(input("Enter value: "))
    user_dict[key] = value
print(f"Sum of values: {sum(user_dict.values())}")

'''
Output ->
Enter number of items: 3
Enter key: 0
Enter value: 34
Enter key: 2
Enter value: 65
Enter key: 1
Enter value: 45
Sum of values: 144
'''