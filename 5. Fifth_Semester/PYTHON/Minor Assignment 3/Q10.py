'''
Ques 10: Create a function that returns all the unique permutations of a given string.
'''

def unique_permutations(s):
    s = sorted(s)
    results = [''.join(s)]
    
    while True:
        i = len(s) - 2
        while i >= 0 and s[i] >= s[i + 1]:
            i -= 1
        if i == -1:
            break
        j = len(s) - 1
        while s[j] <= s[i]:
            j -= 1
        s[i], s[j] = s[j], s[i]
        s = s[:i + 1] + s[i + 1:][::-1]
        results.append(''.join(s))
    
    return results

s = "abc"
print(unique_permutations(s))
