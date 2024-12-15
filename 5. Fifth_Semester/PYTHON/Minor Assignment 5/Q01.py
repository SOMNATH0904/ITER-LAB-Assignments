'''
Ques 1. Write a program to accept student name and marks from the user and create a dictionary. Also, display
student marks by taking student name as input.
'''

students = {}
name = input("Enter student name: ")
marks = int(input("Enter student marks: "))
students[name] = marks
search_name = input("Enter the name to search: ")
print(f"Marks of {search_name}: {students.get(search_name, 'Student not found')}")

'''
Output ->
Enter student name: Somnath
Enter student marks: 82
Enter the name to search: Somnath
Marks of Somnath: 82
'''