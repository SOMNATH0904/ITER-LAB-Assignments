'''
4. Using the gross salary function from Question 3, write a function salary bracket that categorizes the
employee’s gross salary into one of the following brackets:
• ”Low income” if gross salary is below Rs. 50,000/-.
• ”Middle income” if gross salary is between Rs. 50,000/- and Rs. 80,000/-.
• ”High income” if gross salary is more than Rs. 80,000/-.
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

def salary_bracket(gross_salary):
    if gross_salary < 50000:
        return "Low income"
    elif 50000 <= gross_salary <= 80000:
        return "Middle income"
    else:
        return "High income"

gross_salary_val = int(input("Enter the Basic Salary :"))
print("Salary Bracket :", salary_bracket(gross_salary_val))
