package Assignment4;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cg, ug;
        int k=0;
        while(true){
            k++;
            System.out.println("Enter a number between 1 to 10 (User guess) : ");
            ug = sc.nextInt();
            cg = (int)(Math.random()*10)+1;
            System.out.println("Computer guess : "+cg);

            if(ug>cg) {
                System.out.println("Too High, Try Again");
            }
            else if (ug<cg) {
                System.out.println("Too Low, Try Again");
            }
            else {
                System.out.println("Good Guess");
                break;
            }
        }
        System.out.println("Woo!, You have taken only "+k+" chances to guess correctly");
    }
}