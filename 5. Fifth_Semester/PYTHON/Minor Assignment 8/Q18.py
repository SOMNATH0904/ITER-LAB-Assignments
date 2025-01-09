''' 18. Write a program to merge two CSV files containing Titanic data and print the combined dataset.
 Sample Input Files:
 #titanic1.csv
 PassengerId,Survived,Pclass,Name,Sex,Age
 1,1,1,”Allen, Miss. Elisabeth”,female,29
 2,0,3,”Moran, Mr. James”,male,25
 #titanic2.csv
 PassengerId,Survived,Pclass,Name,Sex,Age
 3,1,2,”Brown, Mrs. Mary”,female,35
 4,0,3,”Smith, Mr. John”,male,40'''
 
 
import csv

def merge_csv(file1, file2, output_file):
    try:
        # Read the data from both CSV files
        with open(file1, 'r') as f1, open(file2, 'r') as f2:
            reader1 = csv.DictReader(f1)
            reader2 = csv.DictReader(f2)
            
            # Merge the data
            combined_data = list(reader1) + list(reader2)
            
            # Write the merged data to the output file
            with open(output_file, 'w', newline='') as outfile:
                fieldnames = reader1.fieldnames  # Assuming both files have the same header
                writer = csv.DictWriter(outfile, fieldnames=fieldnames)
                writer.writeheader()
                writer.writerows(combined_data)
        
        # Print the combined dataset
        print(f"Combined dataset from '{file1}' and '{file2}':")
        with open(output_file, 'r') as f:
            print(f.read())

    except Exception as e:
        print(f"Error: {e}")

# Define the input and output file names
file1 = 'titanic1.csv'
file2 = 'titanic2.csv'
output_file = 'merged_titanic.csv'

# Merge the files and print the result
merge_csv(file1, file2, output_file)