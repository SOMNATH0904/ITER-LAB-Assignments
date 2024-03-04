import java.util.*;

class EnrollmentException extends Exception {
    public EnrollmentException(String message) {
        super(message);
    }
}

interface EnrollmentSystem {
    void dropping(Student s);

    void enrolling(Student s);

    boolean checkEnrollment(Student s);

    void display();
}

class Enrollment implements EnrollmentSystem {
    static ArrayList<Student> students = new ArrayList<>();

    public void dropping(Student student) {
        students.remove(student);
    }

    public void enrolling(Student student) {
        students.add(student);
    }

    public boolean checkEnrollment(Student s) {
        for (Student s1 : students) {
            if (s1.id == s.id) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        for (Student s1 : students) {
            s1.display();
        }
    }
}

class Student {
    String name;
    long id;
    Course c;

    public Student(String name, long id, Course c) {
        this.c = c;
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Name: "+name+" -> Id: "+id+" "+c);
    }
}

class Course {
    String courseName, codeString;
    static Scanner sc = new Scanner(System.in);

    public Course() {
        System.out.print("Enter Course name:");
        this.courseName = sc.next();
        System.out.print("Enter Course code:");
        this.codeString = sc.next();
    }

    public String toString() {
        return " -> Course: "+courseName+" -> Subject Code: "+codeString;
    }
}

public class Q9 {
    static Scanner sc = new Scanner(System.in);

    public static Student dataentry() {
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Id: ");
        long id = sc.nextLong();
        Course c = new Course();
        Student s1 = new Student(name, id, c);
        return s1;
    }

    public static void main(String[] args) {
        Enrollment e1 = new Enrollment();
        while(true) {
            System.out.println();
            System.out.println("<----- MENU ----->");
            System.out.println("0. Exit");
            System.out.println("1. Enroll");
            System.out.println("2. Drop");
            System.out.println("3. Display");
            int choice = sc.nextInt();
            switch(choice) {
                case 0:
                    System.exit(0);
                    break;

                case 1:
                    Student s1 = dataentry();
                    try {
                        if(e1.checkEnrollment(s1)) {
                            throw new EnrollmentException("Already Enrolled!");
                        }
                        else {
                            e1.enrolling(s1);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 2:
                    Student s2 = dataentry();
                    try {
                        if(!e1.checkEnrollment(s2)) {
                            throw new EnrollmentException("Student not found!");
                        }
                        else {
                            e1.dropping(s2);
                        }
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    e1.display();
                    break;

                default:
                    System.out.println("Invalid input!!!");
                    break;
            }
        }
    }
}
