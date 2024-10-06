digitToWord = {'0': 'ZERO', '1': 'ONE', '2': 'TWO', '3': 'THREE', '4': 'FOUR', '5': 'FIVE', '6': 'SIX', '7': 'SEVEN', '8': 'EIGHT', '9': 'NINE'}
num = input("Enter an Integer :") 
uniqueDigits = set(num)

for digit in uniqueDigits:
    if digit in digitToWord:
        print(digitToWord[digit], end=' ')