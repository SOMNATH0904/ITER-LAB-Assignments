'''
Ques 18: Write a function to check if a string is an Anagram of another string. (An anagram is a word or phrase
formed by rearranging the letters of a different word or phrase, typically using all the original letters
exactly once, e.g. tom marvolo riddle⇝ i am lord voldemort)
'''

def is_anagram(str1, str2):
    str1 = str1.replace(" ", "").lower()
    str2 = str2.replace(" ", "").lower()
    return sorted(str1) == sorted(str2)


str1 = input("Enter the first string: ")
str2 = input("Enter the second string: ")

if is_anagram(str1, str2):
    print("The strings are anagrams.")
else:
    print("The strings are not anagrams.")
