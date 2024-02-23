package Assignment3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number between 1-9 :");
        int userguess = sc.nextInt();
        int compguess = (int)(Math.random()*(9-1+1)+1);
        System.out.println("User guesses :"+userguess);
        System.out.println("Computer guesses :"+compguess);
        if(userguess == compguess) {
            System.out.println("You got it right");
        }
        else if(Math.abs(userguess-compguess)==1) {
            System.out.println("Almost got it");
        }
        else {
            System.out.println("you got it wrong");
        }
    }
}