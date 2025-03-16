'''
Ques 10: Create a function that returns all the unique permutations of a given string.
'''

from itertools import permutations

def unique_permutations(s):
    """Returns all unique permutations of a given string."""
    return sorted(set(''.join(p) for p in permutations(s)))

# Example usage
string = "abc"
result = unique_permutations(string)
print(f"Unique permutations of '{string}': {result}")
