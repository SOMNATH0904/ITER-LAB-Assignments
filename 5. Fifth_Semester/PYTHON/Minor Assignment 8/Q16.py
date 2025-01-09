'''16. Create a program that reads CSV data and converts it into a list of dictionaries.
 Input file, sample.csv contains,
 Name,Age,Email
 Alice,30,alice@example.com
 Bob,25,bob@example.com
 Charlie,35,charlie@example.com
 Output:
 Successfully read 3 rows from ’data.csv’.
 First 5 rows of the CSV data as dictionaries:
 ’Name’: ’Alice’, ’Age’: ’30’, ’Email’: ’alice@example.com’
 ’Name’: ’Bob’, ’Age’: ’25’, ’Email’: ’bob@example.com’
 ’Name’: ’Charlie’, ’Age’: ’35’, ’Email’: ’charlie@example.com’'''
 
import csv

def read_csv_to_dict(filename):
    try:
        with open(filename, mode='r') as file:
            csv_reader = csv.DictReader(file)
            data = [row for row in csv_reader]
            print(f"Successfully read {len(data)} rows from '{filename}'.")
            print("First 5 rows of the CSV data as dictionaries:")
            for row in data[:5]:
                print(row)
    except FileNotFoundError:
        print(f"Error: The file '{filename}' does not exist.")
    except Exception as e:
        print(f"Error: {e}")

# Input CSV file
filename = 'sample.csv'

# Read and display the CSV data
read_csv_to_dict(filename)


'''sample.csv

Name,Age,Email
Alice,30,alice@example.com
Bob,25,bob@example.com
Charlie,35,charlie@example.com
'''


'''output

Successfully read 3 rows from 'sample.csv'.
First 5 rows of the CSV data as dictionaries:
{'Name': 'Alice', 'Age': '30', 'Email': 'alice@example.com'}
{'Name': 'Bob', 'Age': '25', 'Email': 'bob@example.com'}
{'Name': 'Charlie', 'Age': '35', 'Email': 'charlie@example.com'}
'''