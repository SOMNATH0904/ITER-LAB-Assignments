'''
Ques 22: Create a function that prints the first 10 terms of an arithmetic progression.
'''

def print_arithmetic_progression(first_term, common_difference):
    ap_terms = []
    for i in range(10):
        term = first_term + i * common_difference
        ap_terms.append(term)
    print("The first 10 terms of the arithmetic progression are:", ap_terms)


first_term = int(input("Enter the first term: "))
common_difference = int(input("Enter the common difference: "))
print_arithmetic_progression(first_term, common_difference)
