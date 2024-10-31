'''
1. Write a Python function basic salary that accepts two parameters: hourly rate and hours worked per week.
The function should calculate the basic salary per month (assuming a month has 4 weeks). If the hours
worked per week exceed 40, create another function overtime salary, where every extra hour worked
is paid at 1.5 times the normal hourly rate. Finally, create another function total salary that returns
the sum of the basic salary and overtime.
'''

def basic_salary(hourly_rate, hours_per_week):
    base_hours = min(hours_per_week, 40)
    return base_hours * hourly_rate * 4

def overtime_salary(hourly_rate, hours_per_week):
    if hours_per_week > 40:
        overtime_hours = hours_per_week - 40
        return overtime_hours * hourly_rate * 1.5 * 4
    return 0

def total_salary(hourly_rate, hours_per_week):
    return basic_salary(hourly_rate, hours_per_week) + overtime_salary(hourly_rate, hours_per_week)

hourly_rate = int(input("Enter the Hourly Rate :"))
hours_per_week = int(input("Enter the Hours Per Week :"))
print("Total Salary will be :", total_salary(hourly_rate, hours_per_week))
