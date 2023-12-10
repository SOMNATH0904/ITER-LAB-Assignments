package Assignment2;

import java.util.Scanner;

public class HAQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of eggs you have : ");
        int egg = sc.nextInt();
        int gross = 144;
        int dozen = 12;
        int gr = egg/gross;
        int dz = (egg-(gross*gr))/dozen;
        int left = (egg % gross) - (dozen * dz);
        System.out.println("Your number of eggs is : "+gr+" gross, "+dz+" dozen and "+left);
    }
}
