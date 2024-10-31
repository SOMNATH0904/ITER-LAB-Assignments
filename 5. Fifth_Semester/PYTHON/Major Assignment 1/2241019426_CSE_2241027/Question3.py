'''
3. Using the function basic salary from Question 1, write another function gross salary that calculates
the gross salary of an employee. This function should accept basic salary as input (output from
Question 1), consider a fixed value of allowances (e.g., 20% of basic salary), and return the gross
salary (basic salary + allowances - tax).
'''

def tax_amount(salary):
    if salary < 60000:
        return salary * 0.1
    elif 60000 <= salary <= 85000:
        return salary * 0.15
    else:
        return salary * 0.2
    
def gross_salary(basic_salary):
    allowances = basic_salary * 0.2
    tax = tax_amount(basic_salary)
    return basic_salary + allowances - tax

basic_salary_val = int(input("Enter the Basic Salary :"))
print("Gross Salary :", gross_salary(basic_salary_val))
