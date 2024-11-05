'''
Ques 12: Write a Python program using functions that prompt the user to enter today’s date (in the format
         YYYY-MM-DD) and the current day of the week. Then, ask the user to input a number of days. The
         program should calculate and display the new date and the day of the week after the specified number
         of days have passed.
        
        Input:
            Today’s date: 2024-08-27
            Today’s day: Tuesday
            Number of days: 5
        Output:
            New date: 2024-09-01
            New day: Sunday
'''

from datetime import datetime, timedelta

def get_new_date(today_date, days_to_add):
    date_obj = datetime.strptime(today_date, "%Y-%m-%d")
    new_date = date_obj + timedelta(days=days_to_add)
    return new_date.strftime("%Y-%m-%d"), new_date.strftime("%A")


today_date = input("Today's date (YYYY-MM-DD): ")
today_day = input("Today's day: ")
days_to_add = int(input("Number of days: "))
    
new_date, new_day = get_new_date(today_date, days_to_add)
print("New date:", new_date)
print("New day:", new_day)

