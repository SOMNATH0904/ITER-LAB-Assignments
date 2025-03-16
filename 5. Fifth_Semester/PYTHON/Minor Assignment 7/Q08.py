''' 8. Implement a program to check if a string is a valid URL.'''

import re

def is_valid_url(url):
    pattern = r"\w+://\w+.\w{3}"
    print(pattern)
    return bool(re.match(pattern, url))

print(is_valid_url("https://example.com"))  # Output: True
print(is_valid_url("invalid_url"))         # Output: False