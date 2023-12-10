/*
Design a package that contains two classes Student & Test. The Student class has data
members as name, roll and instance methods input ( ) & output ( ). Similarly the Test class
has data members as mark1, mark2 and instance methods input ( ), output ( ), Student is
extended by Test. Another package carry interface Sports with 2 attributes score1, score2.
Find grand total mark & score in another class.
*/

package A2Q10;

import java.util.Scanner;

public class Test extends Student {
    int mark1;
    int mark2;

    void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Enter Student's Mark1 and Mark2 : ");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
    }

    void output() {
        super.output();
        System.out.println("Student Mark1, Mark2 and Mark3 is as follows : "+mark1+" "+mark2);
    }
}