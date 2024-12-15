'''
Ques 19. Given a long list of words, write a Python function unique pairs(words) to find all unique pairs
of words that:
• Have no common letters (e.g., "cat" and "dogs" have no letters in common).
2
Centre for Data Science
Institute of Technical Education & Research, SOA, Deemed to be University
• Each word in the pair should have at least 4 letters.
• Each unique pair should be stored in a set as a tuple in lexicographical order.
The function should return a set of all such unique pairs. Example:
words = ["apple", "dogs", "cat", "bird", "fish", "zebra", "lion"]
print(unique_pairs(words))
Expected Output (Order may vary due to set properties):
{("apple", "dogs"), ("apple", "bird"), ("apple", "fish"),
("bird", "dogs"), ("dogs", "fish"), ("dogs", "zebra"),
("dogs", "lion"), ("fish", "zebra"), ("lion", "zebra")}
'''

def unique_pairs(words):
    result = set()
    for i in range(len(words)):
        for j in range(i + 1, len(words)):
            if len(set(words[i]) & set(words[j])) == 0:
                result.add(tuple(sorted((words[i], words[j]))))
    return result

words = ["apple", "dogs", "cat", "bird", "fish", "zebra", "lion"]
print(unique_pairs(words))

'''
Output ->
{('apple', 'dogs'), ('bird', 'cat'), ('cat', 'lion'), ('apple', 'fish'), ('cat', 'fish'), ('dogs', 'zebra'), ('fish', 'zebra'), ('apple', 'bird'), ('lion', 'zebra'), ('cat', 'dogs')}
'''