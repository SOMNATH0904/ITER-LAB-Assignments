package Assignment3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of water in ml :");
        int water = sc.nextInt();
        if(water >= 5000) {
            System.out.println("Yes, Alice is foloowing doctor's advice");
        }
        else {
            System.out.println("No, Alice is not foloowing doctor's advice");
        }
    }
}