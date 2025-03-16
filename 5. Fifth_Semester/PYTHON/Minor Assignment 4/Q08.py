'''
Ques 8: Write a function that takes n as an input and creates a list of n lists such that ith list contains the first
five multiples of i.
'''

def create_multiples_list(n):
    result = []
    for i in range(1, n+1):
        multiples = [i * j for j in range(1, 6)] 
        result.append(multiples)
    return result

n = int(input("Enter a number: "))
multiples_list = create_multiples_list(n)
print(multiples_list)
