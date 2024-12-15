'''
Ques 5. A dictionary which maps country names to Internet top-level domains (TLDs) is given as follows:
tlds = {‘Canada’: ‘ca’, ‘United States’: ‘us’, ‘Mexico’: ‘mx’}
Perform the following tasks and display the results:
a) Check whether the dictionary contains the key ‘Canada’.
b) Check whether the dictionary contains the key ‘France’.
c) Iterate through the key-value pairs and display them in a two-column format.
d) Add the key–value pair ‘Sweden’ and ‘sw’ (incorrect TLD).
e) Update the value for the key ‘Sweden’ to ‘se’ (correct TLD).
f) Use dictionary comprehension to reverse the keys and values.
'''

tlds = {"Canada": "ca", "United States": "us", "Mexico": "mx"}
print("Contains 'Canada':", "Canada" in tlds)
print("Contains 'France':", "France" in tlds)
print("Key-Value pairs:")
for key, value in tlds.items():
    print(f"{key}: {value}")
tlds["Sweden"] = "sw"
tlds["Sweden"] = "se"
reversed_tlds = {v: k for k, v in tlds.items()}
print("Reversed dictionary:", reversed_tlds)

'''
Output ->
Contains 'Canada': True
Contains 'France': False
Key-Value pairs:
Canada: ca
United States: us
Mexico: mx
Reversed dictionary: {'ca': 'Canada', 'us': 'United States', 'mx': 'Mexico', 'se': 'Sweden'}
'''