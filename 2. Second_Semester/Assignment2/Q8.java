/*
Define an interface DetailInfo to declare methods display ( ) & count ( ). Another class Person
contains a static data member maxcount, instance member name & method display ( ) to display
name of a person, count the no. of characters present in the name of the person.
*/

import java.util.Scanner;

interface DetailInfo {
    void display();
    void count();
}

class xyz implements DetailInfo {
    static int maxCount;
    String name;
    xyz(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Name of Person is : "+name);
        System.out.println("No. of Characters in the name of person is : "+maxCount);
    }
    @Override
    public void count() {
        for(int i = 0; i < name.length(); i++) {
            if(Character.isLetter(name.charAt(i))) {
                maxCount += 1;
            }
        }
    }
}
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Person : ");
        String name = sc.nextLine();
        xyz p1 = new xyz(name);
        p1.count();
        p1.display();
    }
}