/**
 * Ques 4 : Create a class Student having member variable name, age, and mark and required get and set methods. Create a LinkedList of Student type and perform the below operation on it.
 * (a.) Display the list
 * (b.) Ask the user to enter a Student object and print the existence of the object. Specify is the object is search according to reference or contain.
 * (c.) Remove a specified Student object.
 * (d.) Count the number of object present in the list.
 * (e.)Override equals method checking if the two Student objects share all the same values.
 */

import java.util.LinkedList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getMark() {
        return mark;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setMark(double mark) {
        this.mark = mark;
    }
    @Override
    public boolean equals(Object obj) {
        Student student = (Student) (obj);
        return age == student.age && Double.compare(student.mark, mark) == 0 && name.equals(student.name);
    }
}

public class Q04 {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();
        studentList.add(new Student("Sanu", 20, 85.5));
        studentList.add(new Student("Surya", 21, 78.0));
        studentList.add(new Student("Samrat", 22, 92.5));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Students in the list:");
        displayList(studentList);
        System.out.println("Enter student details to check existence (name, age, mark):");
        String name = scanner.next();
        int age = scanner.nextInt();
        double mark = scanner.nextDouble();
        Student studentToCheck = new Student(name, age, mark);
        checkStudentExistence(studentList, studentToCheck);
        System.out.println("Enter student details to remove (name, age, mark):");
        name = scanner.next();
        age = scanner.nextInt();
        mark = scanner.nextDouble();
        Student studentToRemove = new Student(name, age, mark);
        removeStudent(studentList, studentToRemove);
        System.out.println("Number of students in the list: " + studentList.size());
        System.out.println("Checking equality of students:");
        Student student1 = new Student("Alice", 20, 85.5);
        Student student2 = new Student("Alice", 20, 85.5);
        System.out.println("Equality of student1 and student2: " + student1.equals(student2));
    }

    public static void displayList(LinkedList<Student> list) {
        for (Student student : list) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Mark: " + student.getMark());
        }
    }
    public static void checkStudentExistence(LinkedList<Student> list, Student studentToCheck) {
        boolean containsStudent = list.contains(studentToCheck);
        System.out.println("Does the list contain the student (by reference): " + containsStudent);
        boolean foundByValue = false;
        for (Student student : list) {
            if (student.equals(studentToCheck)) {
                foundByValue = true;
                break;
            }
        }
        System.out.println("Does the list contain the student (by value): " + foundByValue);
    }
    public static void removeStudent(LinkedList<Student> list, Student studentToRemove) {
        list.remove(studentToRemove);
        System.out.println("Student removed successfully.");
    }
}

/**
 * OUTPUT :
 *
 * Students in the list:
 * Name: Sanu, Age: 20, Mark: 85.5
 * Name: Surya, Age: 21, Mark: 78.0
 * Name: Samrat, Age: 22, Mark: 92.5
 * Enter student details to check existence (name, age, mark):
 * Surya 21 78.0
 * Does the list contain the student (by reference): true
 * Does the list contain the student (by value): true
 * Enter student details to remove (name, age, mark):
 * Sanu 20 85.5
 * Student removed successfully.
 * Number of students in the list: 2
 * Checking equality of students:
 * Equality of student1 and student2: true
 */