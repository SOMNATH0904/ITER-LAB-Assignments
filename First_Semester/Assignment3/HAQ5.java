package Assignment3;

import java.util.Scanner;

public class HAQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your gender (M or F) : ");
        char gender = sc.nextLine().charAt(0);
        System.out.println("Enter First Name : ");
        String FName = sc.nextLine();
        System.out.println("Enter Last Name : ");
        String LName = sc.nextLine();
        System.out.println("Enter your Age : ");
        int age = sc.nextInt();
        if(gender == 'm' || gender == 'M' && age >= 20) {
            System.out.println("Then I Shall call you Mr. "+FName+".");
        } else if(gender == 'm' || gender == 'M' && age < 20) {
            System.out.println("Then I Shall call you "+FName+" "+LName+".");
        } else if(gender == 'f' || gender == 'F' && age >= 20) {
            System.out.println("Are you Married, "+FName+" (y or n) ? ");
            char married = sc.next().charAt(0);
            if(married == 'y' || married == 'Y') {
                System.out.println("Then I Shall call you Mrs. "+FName+" "+LName+".");
            } else {
                System.out.println("Then I Shall call you Ms. "+FName+" "+LName+".");
            }
        } else {
            System.out.println("Then I Shall call you "+FName+" "+LName+".");
        }
    }
}
