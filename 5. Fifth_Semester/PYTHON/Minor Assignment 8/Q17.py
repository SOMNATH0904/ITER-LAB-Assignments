''' 17. Create a robust program to read user input and write it into a file, handling invalid inputs gracefully.'''

def write_to_file(filename):
    try:
        user_input = input("Please enter text to write into the file: ")
        if not user_input:
            raise ValueError("Input cannot be empty.")
        
        with open(filename, mode='w') as file:
            file.write(user_input)
        print(f"Successfully wrote to '{filename}'.")

    except ValueError as ve:
        print(f"Error: {ve}")
    except IOError:
        print(f"Error: Unable to write to the file '{filename}'.")
    except Exception as e:
        print(f"Unexpected error: {e}")

# Input file name
filename = 'outputs.txt'

# Call function to write user input to file
write_to_file(filename)