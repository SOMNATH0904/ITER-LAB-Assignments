''' 6. Write a Python program that lets an instructor enter a student’s first and last name (strings) and three
 exam grades (integers). Save each student’s data in a grades.csv file using the csv module, with each
 record in the format:
 f
 irstname,lastname,exam1grade,exam2grade,exam3grade'''
 
import csv

def save_student_data():
    firstname = input("Enter the student's first name: ")
    lastname = input("Enter the student's last name: ")
    exam1 = int(input("Enter the first exam grade: "))
    exam2 = int(input("Enter the second exam grade: "))
    exam3 = int(input("Enter the third exam grade: "))
    
    with open('grades.csv', mode='a', newline='') as file:
        writer = csv.writer(file)
        writer.writerow([firstname, lastname, exam1, exam2, exam3])

save_student_data()