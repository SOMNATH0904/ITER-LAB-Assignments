'''
Ques 8: Write a Python program that takes the name of a month as input and returns the number of days in
that month.
Input: The name of the Month: February
Output: No. of days: 28/29 days
'''

def days_in_month(month):
    month = month.capitalize()

    if month == "January" or month == "March" or month == "May" or month == "July" or month == "August" or month == "October" or month == "December":
        return "No. of days: 31 days"
    elif month == "April" or month == "June" or month == "September" or month == "November":
        return "No. of days: 30 days"
    elif month == "February":
        return "No. of days: 28/29 days (depending on leap year)"
    else:
        return "Invalid month name!! Please enter a valid month."

input_month = input("Enter the name of the month: ")
print(days_in_month(input_month))