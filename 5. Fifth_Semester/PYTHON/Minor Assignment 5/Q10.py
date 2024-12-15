'''
Ques 10. Write a program to find the number of occurrences of each vowel present in a given string, and also
print the vowels.
'''

string = input("Enter a string: ").lower()
vowels = "aeiou"
occurrences = {vowel: string.count(vowel) for vowel in vowels if vowel in string}
print("Vowels found:", occurrences.keys())
print("Occurrences:", occurrences)

'''
Output ->
Enter a string: Hello, It's DevSom404
Vowels found: dict_keys(['e', 'i', 'o'])
Occurrences: {'e': 2, 'i': 1, 'o': 2}
'''