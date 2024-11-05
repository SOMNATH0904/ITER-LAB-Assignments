'''
Ques 7: Write a Python function to check whether an alphabet is a vowel or consonant.
'''

def check_vowel_consonant(ch):
    ch = ch.lower()
    if ch in 'aeiou':
        return 'Vowel'
    elif 'a' <= ch <= 'z':
        return 'Consonant'
    else:
        return 'Invalid input. please enter a single alphabet.'
    
print(check_vowel_consonant('A'))
print(check_vowel_consonant('1'))
print(check_vowel_consonant('s'))