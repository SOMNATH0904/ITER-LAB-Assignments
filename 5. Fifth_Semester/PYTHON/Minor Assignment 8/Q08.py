''' 8. Write a function to safely deserialize JSON data from a file and handle errors if the data is invalid.
 Input file (Valid), ’data.json’ contains,
 ”name”: ”Alice”, ”age”: 30, ”skills”: [”Python”, ”Data Science”]
 Output:
 JSON data successfully loaded.
 Deserialized Data: ’name’: ’Alice’, ’age’: 30, ’skills’: [’Python’, ’Data Science’]
 Input file (Invalid), ’data.json’ contains,
 ”name”: ”Alice”, ”age”: 30, ”skills”: [”Python”, ”Data Science”
 Output:
 Error: The file ’missing.json’ does not exist.
 No valid data could be loaded.'''
 
import json

def safe_deserialize_json(filename):
    try:
        with open(filename, 'r') as file:
            data = json.load(file)
        print("JSON data successfully loaded.")
        print("Deserialized Data:", data)
    except FileNotFoundError:
        print(f"Error: The file '{filename}' does not exist.")
        print("No valid data could be loaded.")
    except json.JSONDecodeError:
        print("Error: Invalid JSON format.")
        print("No valid data could be loaded.")

filename = 'data.json'
safe_deserialize_json(filename)