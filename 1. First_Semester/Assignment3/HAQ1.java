package Assignment3;

import java.util.Scanner;

public class HAQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Computer is : ");
        int computer = (int) (Math.random()*3);
        System.out.println("Scissor(0), rock(1), paper(2) : ");
        switch(computer) {
            case 0 :
                System.out.println("Scissor");
                break;
            case 1 :
                System.out.println("Rock");
                break;
            case 2 :
                System.out.println("Paper");
                break;
        }
        System.out.println("The User is :");
        int user = sc.nextInt();
        switch(user) {
            case 0 :
                System.out.println("Scissor");
                break;
            case 1 :
                System.out.println("Rock");
                break;
            case 2 :
                System.out.println("Paper");
                break;
        }
        if(computer == user) {
            System.out.println("It is Draw!");
        } else {
            boolean win = (user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1);
            if(win) {
                System.out.println("User Won!");
            } else {
                System.out.println("Computer Won!");
            }
        }
    }
}
