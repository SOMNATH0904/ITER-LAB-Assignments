'''19. Implement a program that reads a titanic1.CSV file into a Pandas DataFrame and finds the passenger
 with the longest name.'''
 
 
import pandas as pd

def find_longest_name(file_name):
    try:
        # Read the CSV file into a Pandas DataFrame
        df = pd.read_csv(file_name)

        # Find the passenger with the longest name
        longest_name_row = df.loc[df['Name'].apply(len).idxmax()]
        
        # Output the result
        print(f"The passenger with the longest name is:")
        print(f"Name: {longest_name_row['Name']}")
        print(f"PassengerId: {longest_name_row['PassengerId']}")
        print(f"Sex: {longest_name_row['Sex']}")
        print(f"Age: {longest_name_row['Age']}")
        print(f"Pclass: {longest_name_row['Pclass']}")
        print(f"Survived: {longest_name_row['Survived']}")

    except Exception as e:
        print(f"Error: {e}")

# Define the file name
file_name = 'titanic1.csv'

# Find the passenger with the longest name
find_longest_name(file_name)