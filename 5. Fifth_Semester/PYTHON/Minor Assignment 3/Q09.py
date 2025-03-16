'''
Ques 9: Write two functions, one of which converts a binary number to decimal and the other one does the
reverse.
'''

def binary_to_decimal(binary_str):
    """Converts a binary number (as a string) to decimal."""
    return int(binary_str, 2)

def decimal_to_binary(decimal_num):
    """Converts a decimal number to binary (as a string)."""
    return bin(decimal_num)[2:]

# Example usage:
binary_number = "1011"
decimal_number = 11

# Binary to Decimal
decimal_result = binary_to_decimal(binary_number)
print(f"The decimal equivalent of binary {binary_number} is: {decimal_result}")

# Decimal to Binary
binary_result = decimal_to_binary(decimal_number)
print(f"The binary equivalent of decimal {decimal_number} is: {binary_result}")
