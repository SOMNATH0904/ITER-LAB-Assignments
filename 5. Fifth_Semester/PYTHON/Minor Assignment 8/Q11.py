'''11. Write a Python function that takes two files of equal size as input from the user. The first file contains
 weights of items and the second file contains corresponding prices. Create another file that should
 contain price per unit weight for each item.'''
 
def calculate_price_per_unit_weight(file1, file2, output_file):
    try:
        with open(file1, 'r') as f1, open(file2, 'r') as f2:
            weights = f1.readlines()
            prices = f2.readlines()

        if len(weights) != len(prices):
            print("Error: The files do not have the same number of lines.")
            return

        with open(output_file, 'w') as out_file:
            for weight, price in zip(weights, prices):
                weight = float(weight.strip())
                price = float(price.strip())
                price_per_unit = price / weight
                out_file.write(f"{price_per_unit}\n")

        print(f"Price per unit weight has been written to '{output_file}'.")

    except FileNotFoundError:
        print("Error: One or both of the input files were not found.")
    except ValueError:
        print("Error: Invalid data in the files.")

file1 = input("Enter the file containing weights: ")
file2 = input("Enter the file containing prices: ")
output_file = 'price_per_unit.txt'
calculate_price_per_unit_weight(file1, file2, output_file)