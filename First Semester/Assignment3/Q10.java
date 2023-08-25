package Assignment3;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks :");
        int marks = sc.nextInt();
        int n = marks/10;
        switch (n) {
            case 10 :
            case 9 : System.out.println("Your grade is O");
                break;
            case 8 : System.out.println("Your grade is A");
                break;
            case 7 : System.out.println("Your grade is B");
                break;
            case 6 : System.out.println("Your grade is C");
                break;
            case 5 : System.out.println("Your grade is D");
                break;
            case 4 : System.out.println("Your grade is E");
                break;
            default : System.out.println("Your grade is F");
        }
    }
}