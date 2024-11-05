'''
Ques 2: Find the numbers between 100 and 500, which are divisible by 3 and multiples of 5 using function in
Python.
'''

def find_numbers():
    result = []
    for i in range(100, 501):
        if(i % 3 == 0 and i % 5 == 0):
            result.append(i)
    return result

print(find_numbers())