/*
Design a package that contains two classes Student & Test. The Student class has data
members as name, roll and instance methods input ( ) & output ( ). Similarly the Test class
has data members as mark1, mark2 and instance methods input ( ), output ( ), Student is
extended by Test. Another package carry interface Sports with 2 attributes score1, score2.
Find grand total mark & score in another class.
*/

        package A2Q10;

import java.util.Scanner;

public class Student {
    String name;
    int roll;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        name = sc.nextLine();
        System.out.println("Enter Student Roll Number : ");
        roll = sc.nextInt();
    }

    void output() {
        System.out.println("Student name is : "+name);
        System.out.println("Student Roll Number is : "+roll);
    }
}