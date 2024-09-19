'''
Ques 25: Create a program that reads duration from the user as a number of days, hours, minutes, and seconds.
Compute and display the total number of seconds represented by this duration.
'''

days = int(input("Enter no of days: "))
hours = int(input("Enter no of hours: "))
minutes = int(input("Enter no of minutes: "))
seconds = int(input("Enter no of seconds: "))

totalSeconds = (days * 24 * 60 * 60) + (hours * 60 * 60) + (minutes * 60) + seconds

print("Total no of Seconds :", totalSeconds)


'''
Output ->
Enter no of days: 12
Enter no of hours: 5
Enter no of minutes: 3
Enter no of seconds: 54
Total no of Seconds : 1055034
'''
