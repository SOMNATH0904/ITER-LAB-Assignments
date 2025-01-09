''' write code that reads the grades from the grades.txt file. Display the individual grades and their total,
 count, and average.'''
 
 
with open('grades.txt', 'r') as file:
    grades = [int(line.strip()) for line in file]

print("Individual Grades:")
for grade in grades:
    print(grade)

total = sum(grades)
count = len(grades)
average = total / count if count > 0 else 0

print(f"\nTotal: {total}")
print(f"Count: {count}")
print(f"Average: {average:.2f}")