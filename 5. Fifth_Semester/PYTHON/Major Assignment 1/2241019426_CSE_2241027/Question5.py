'''
5. Take three different sets of employee names, hourly rates and hours worked per week as user input.
Write a Python function employee report that generates a formatted report of all employees’ salary
details. This function should print the employee names, basic salaries, gross salaries, tax amounts,
and salary brackets in a readable format.
'''

from Question1 import basic_salary
from Question3 import gross_salary
from Question2 import tax_amount
from Question4 import salary_bracket

def employee_report(employees):
    print("Employee Salary Report")
    print("Name\t\tBasic Salary\tGross Salary\tTax Amount\tSalary Bracket")
    print("-" * 70)
    for name, hourly_rate, hours_per_week in employees:
        basic = basic_salary(hourly_rate, hours_per_week)
        gross = gross_salary(basic)
        tax = tax_amount(basic)
        bracket = salary_bracket(gross)
        print(f"{name}\t\t{basic:.2f}\t\t{gross:.2f}\t\t{tax:.2f}\t\t{bracket}")

employees = [
    ("Abhimanyu", 500, 45),
    ("Shraddha", 450, 40),
    ("Abhijeet", 400, 35)
]
employee_report(employees)
