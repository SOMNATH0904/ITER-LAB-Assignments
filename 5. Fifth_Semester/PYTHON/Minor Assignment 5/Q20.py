'''
Ques 20. Write a Python program to change Mukesh’s net worth to 9650 in the following dictionary:
sample_dict = {
‘person1’: {‘name’: ‘Bezos’, ‘net worth’: 21,880},
‘person2’: {‘name’: ‘Elon’, ‘net worth’: 31,570},
‘person3’: {‘name’: ‘Mukesh’, ‘net worth’: 965}
'''

sample_dict = {
    'person1': {'name': 'Bezos', 'net worth': 21880},
    'person2': {'name': 'Elon', 'net worth': 31570},
    'person3': {'name': 'Mukesh', 'net worth': 965}
}

sample_dict['person3']['net worth'] = 9650
print(sample_dict)

'''
Output ->
{'person1': {'name': 'Bezos', 'net worth': 21880}, 'person2': {'name': 'Elon', 'net worth': 31570}, 'person3': {'name': 'Mukesh', 'net worth': 9650}}
'''