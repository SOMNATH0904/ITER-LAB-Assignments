'''
Ques 11. Write a function that takes a number as an input parameter and returns the corresponding text in
words, e.g., on input 452, the function should return ‘Four Five Two’. Use a dictionary for mapping
digits to their string representation.
'''

def number_to_words(number):
    digit_to_word = {
        0: "Zero", 1: "One", 2: "Two", 3: "Three", 4: "Four",
        5: "Five", 6: "Six", 7: "Seven", 8: "Eight", 9: "Nine"
    }
    return " ".join(digit_to_word[int(digit)] for digit in str(number))

number = int(input("Enter a number: "))
print(number_to_words(number))

'''
Output ->
Enter a number: 12
One Two
'''