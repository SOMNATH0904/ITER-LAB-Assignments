''' 24. Use regular expressions to validate secure passwords. Passwords must have a minimum of 8 charac
ters and contain at least one each from uppercase characters, lowercase characters, digits, and punc
tuation characters, such as characters in ’!@#$%&∗?′.'''

import re

def validate_password(password):
    pattern = r'^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[!@#$%&*?])[A-Za-z\d!@#$%&*?]{8,}$'
    if re.match(pattern, password):
        return "Valid password"
    else:
        return "Invalid password"

password = input("Enter a password: ")
print(validate_password(password))