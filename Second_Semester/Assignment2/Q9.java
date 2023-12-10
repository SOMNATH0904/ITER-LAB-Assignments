/*
Write a Java program to declare a Class named as Student which contains roll number,
name and course as instance variables and input_Student () and display_Student () as
instance methods. A derived class Exam is created from the class Student. The derived
class contains mark1, mark2, mark3 as instance variables representing the marks of three
subjects and input_Marks () and display_Result () as instance methods. Create an array of
objects of the Exam class and display the result of 5 students.
*/

import java.util.Scanner;

class Student1 {
    int roll;
    String name;
    String course;

    void inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        name = sc.nextLine();
        System.out.println("Enter Student Roll Number : ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Course : ");
        course = sc.nextLine();
    }

    void displayStudent() {
        System.out.println("Student name is : "+this.name);
        System.out.println("Student Roll Number is : "+this.roll);
        System.out.println("Student Course is : "+this.course);
    }
}

class Exam extends Student1 {
    int mark1;
    int mark2;
    int mark3;

    void inputMarks() {
        super.inputStudent();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Mark1, Mark2 and Mark3 : ");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        mark3 = sc.nextInt();
    }

    void displayResult() {
        super.displayStudent();
        System.out.println("Student Mark1, Mark2 and Mark3 is as follows : "+this.mark1+" "+this.mark2+" "+this.mark3);
    }
}


public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Students : ");
        int n = sc.nextInt();
        Exam[] E = new Exam[n];
        for(int i = 0; i < n; i++) {
            E[i] = new Exam();
//			E[i].inputStudent();   --> Since, We are using super keyword in that class that'swhy we are again not printing this Statement ...
            E[i].inputMarks();
        }
        for(int i = 0; i < n; i++) {
//			E[i].displayStudent();  --> Since, We are using super keyword in that class that'swhy we are again not printing this Statement ...
            E[i].displayResult();
        }
    }
}