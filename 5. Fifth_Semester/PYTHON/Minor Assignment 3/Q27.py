'''
Ques 27: Write a function that takes a positive number as an input and converts the respective digits into corresponding
text. Example: 85 7→ eight five, 123 7→ one two three.
'''

def number_to_text(num):
    text = ""
    for digit in str(num):
        if digit == '0':
            text += "zero "
        elif digit == '1':
            text += "one "
        elif digit == '2':
            text += "two "
        elif digit == '3':
            text += "three "
        elif digit == '4':
            text += "four "
        elif digit == '5':
            text += "five "
        elif digit == '6':
            text += "six "
        elif digit == '7':
            text += "seven "
        elif digit == '8':
            text += "eight "
        elif digit == '9':
            text += "nine "
    return text.strip()


number = int(input("Enter a positive number: "))
print("Number in text:", number_to_text(number))
