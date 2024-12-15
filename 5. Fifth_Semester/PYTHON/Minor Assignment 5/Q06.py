'''
Ques 6. For the following dictionary, create lists of its keys, values, and items, and show those lists.
roman numerals = {‘I’: 1, ‘II’: 2, ‘III’: 3, ‘V’: 5}
'''

roman_numerals = {"I": 1, "II": 2, "III": 3, "V": 5}
keys = list(roman_numerals.keys())
values = list(roman_numerals.values())
items = list(roman_numerals.items())
print("Keys:", keys)
print("Values:", values)
print("Items:", items)

'''
Output ->
Keys: ['I', 'II', 'III', 'V']
Values: [1, 2, 3, 5]
Items: [('I', 1), ('II', 2), ('III', 3), ('V', 5)]
'''