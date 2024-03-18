class Student1 implements Comparable<Student1> {
    String name;
    int rn;
    double totalMark;

    Student1(String name, int rn, double totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public int getRn() {
        return rn;
    }

    public double getTotalMark() {
        return totalMark;
    }

    @Override
    public int compareTo(Student1 otherStudent) {
        return this.rn - otherStudent.rn;
    }

    public static Student1 linearSearch(Student1[] students, int targetRollNumber) {
        for (Student1 student : students) {
            if (student.getRn() == targetRollNumber) {
                return student;
            }
        }
        return null;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Student1[] students = {
                new Student1("Alice", 101, 85.5),
                new Student1("Bob", 102, 78.0),
                new Student1("Charlie", 103, 92.3),
                new Student1("David", 104, 88.7)
        };

        int targetRollNumber = 103;
        Student1 foundStudent = Student1.linearSearch(students, targetRollNumber);

        if (foundStudent != null) {
            System.out.println("Student found -->");
            System.out.println("Name: "+foundStudent.getName()+" Roll Number: "+foundStudent.getRn()+" Total Marks: "+foundStudent.getTotalMark());
        } else {
            System.out.println("Student with roll number "+targetRollNumber+" not found.");
        }
    }
}
