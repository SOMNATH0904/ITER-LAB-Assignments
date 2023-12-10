/*
Design a package that contains two classes Student & Test. The Student class has data
members as name, roll and instance methods input ( ) & output ( ). Similarly the Test class
has data members as mark1, mark2 and instance methods input ( ), output ( ), Student is
extended by Test. Another package carry interface Sports with 2 attributes score1, score2.
Find grand total mark & score in another class.
*/

package A2Q10;

public class Main {
    public static void main(String[] args) {
        Test T1 = new Test();
        T1.input();
        int grandTotal = T1.mark1 + T1.mark2 + Sports.score1 + Sports.score2;
        System.out.println("Grand Total : "+grandTotal);
    }
}