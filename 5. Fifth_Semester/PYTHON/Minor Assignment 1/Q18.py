'''
Ques 18: Evaluate the following expressions involving relational and logical operators:
a. 'hi' > 'hello' and 'bye' < 'Bye'
b. 'hi' > 'hello' or 'bye' < 'Bye'
c. 7 > 8 or 5 < 6 and 'I am fine > 'I am not fine'
d. 10 !=9 and 29 >= 29
e. 10 !=9 and 29 >= 29 and 'hi' > 'hello' or 'bye' < 'Bye' and 7 <= 2.5
f. 5 % 10 + 10 < 50 and 29 >= 29
g. 7 ** 2 <= 5 // 9 % 3 or 'bye' < 'Bye'
h. 5 % 10 < 8 and -25 > 1 * 8 // 5
i. 7 ** 2 // 4 + 5 > 8 or 5 != 6
j. 7/4 < 6 and 'I am fine > 'I am not fine'
k. 10 + 6 * 2 ** 2 != 9//4-3 and 29 >= 29/9
l. 'hello' * 5 > 'hello' or 'bye' < 'Bye'
'''

result_a = 'hi' > 'hello' and 'bye' < 'Bye'
result_b = 'hi' > 'hello' or 'bye' < 'Bye'
result_c = 7 > 8 or 5 < 6 and 'I am fine' > 'I am not fine'
result_d = 10 != 9 and 29 >= 29
result_e = 10 != 9 and 29 >= 29 and 'hi' > 'hello' or 'bye' < 'Bye' and 7 <= 2.5
result_f = 5 % 10 + 10 < 50 and 29 >= 29
result_g = 7 ** 2 <= 5 // 9 % 3 or 'bye' < 'Bye'
result_h = 5 % 10 < 8 and -25 > 1 * 8 // 5
result_i = 7 ** 2 // 4 + 5 > 8 or 5 != 6
result_j = 7 / 4 < 6 and 'I am fine' > 'I am not fine'
result_k = 10 + 6 * 2 ** 2 != 9 // 4 - 3 and 29 >= 29 / 9
result_l = 'hello' * 5 > 'hello' or 'bye' < 'Bye'

print("Result of expression a:", result_a)
print("Result of expression b:", result_b)
print("Result of expression c:", result_c)
print("Result of expression d:", result_d)
print("Result of expression e:", result_e)
print("Result of expression f:", result_f)
print("Result of expression g:", result_g)
print("Result of expression h:", result_h)
print("Result of expression i:", result_i)
print("Result of expression j:", result_j)
print("Result of expression k:", result_k)
print("Result of expression l:", result_l)


'''
Output ->
Result of expression a: False
Result of expression b: True
Result of expression c: False
Result of expression d: True
Result of expression e: True
Result of expression f: True
Result of expression g: False
Result of expression h: False
Result of expression i: True
Result of expression j: False
Result of expression k: True
Result of expression l: True
'''