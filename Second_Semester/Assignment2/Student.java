/*
Define a class called Student with instance variables Roll, Name, DSA_Mark. Also, the class
consists of instance methods getdata( ), showdata( ) to provide input to the instance variable
and to display the value of instance variable. Write a program to create the details of 5 students.
Display the information of the students who has secured the highest DSA_Mark.
*/

import java.util.Scanner;

public class Student {

    int Roll;
    String Name;
    int DSA_Mark;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of Student : ");
        Name = sc.nextLine();
        System.out.println("Enter Roll No : ");
        Roll = sc.nextInt();
        System.out.println("Enter the DSA Marks : ");
        DSA_Mark = sc.nextInt();
    }

    void showData() {
        System.out.println("The Student Name is : "+this.Name+" having Roll : "+this.Roll+" and their DSA Marks is : "+this.DSA_Mark);
    }

    public static void main(String[] args) {

        Student[] S = new Student[5];
        System.out.println("Enter Student Info --> ");
        int maxMark = Integer.MIN_VALUE;
        int index = 0;

        for(int i = 0; i < 5; i++) {
            S[i] = new Student();
            S[i].getData();

            if(S[i].DSA_Mark > maxMark) {
                maxMark = S[i].DSA_Mark;
                index = i;
            }
        }

        System.out.println("The Student Info are : ");
        for(int i = 0; i < 5; i++) {
            S[i].showData();
        }
        System.out.println();

        System.out.println("Student who have secured the Highest DSA mark is -->  ");
        S[index].showData();
    }

}