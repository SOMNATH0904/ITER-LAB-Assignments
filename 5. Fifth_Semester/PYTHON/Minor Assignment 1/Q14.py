'''
Ques 14: Evaluate the following expressions:
(a<b) or (not(c==b) and (c<a))
a. a =10, b=5, c=0
b. a=1.21, b=1.20, c=1.22
'''

a = 10
b = 5
c = 0

result1 = (a < b) or (not(c == b) and (c < a))
print("Result 1 is :", result1)


a = 1.21
b = 1.20
c = 1.22

result2 = (a < b) or (not(c == b) and (c < a))
print("Result 2 is :", result2)


'''
Output ->
Result 1 is : True
Result 2 is : False
'''