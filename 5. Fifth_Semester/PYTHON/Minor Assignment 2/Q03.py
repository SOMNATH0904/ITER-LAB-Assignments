score = float(input("Enter the student's numeric score (0-100): "))

if(score >= 90 and score <= 100):
    grade = 'A'
    comment = "Excellent"
elif(score >= 80 and score < 90):
    grade = 'B'
    comment = "Good"
elif(score >= 70 and score < 80):
    grade = 'C'
    comment = "Average"
elif(score >= 60 and score < 70):
    grade = 'D'
    comment = "Needs Improvement"
elif(score < 60 and score >= 0):
    grade = 'F'
    comment = "Failing"
else:
    grade = None

if grade:
    print(f"Grade: {grade}, Comment: {comment}")
else:
    print("Invalid score. Please enter a number between 0 and 100.")