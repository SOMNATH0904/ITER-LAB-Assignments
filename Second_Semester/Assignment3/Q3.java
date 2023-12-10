import java.util.Scanner;

class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String msg) {
        super(msg);
    }
}

class Student {
    String name;
    int mark;
    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of Student : ");
        String name = sc.nextLine();
        System.out.println("Enter Mark of Student : ");
        int mark = sc.nextInt();

        try {
            if(mark > 100) {
                throw new MarksOutOfBoundsException("Marks can't be greater than 100");
            }
            Student S = new Student(name, mark);
            System.out.println("Student Name : "+S.name);
            System.out.println("Student Marks : "+S.mark);
        }
        catch(MarksOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}