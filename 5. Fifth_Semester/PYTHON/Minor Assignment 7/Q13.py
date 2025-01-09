''' 13. Check whether a sentence contains more than one space between words. If so, remove the extra
 spaces and display the results. For example, ’Hello
 World’ should become ’Hello World’.'''
 
def remove_extra_spaces(sentence):
    return ' '.join(sentence.split())

print(remove_extra_spaces("Hello    World"))  # Output: Hello World