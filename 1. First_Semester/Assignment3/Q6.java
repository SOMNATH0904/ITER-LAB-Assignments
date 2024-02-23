package Assignment3;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your power consumption unit :");
        int unit = sc.nextInt();
        double bill = 0;
        if (unit <= 50) {
            bill = unit*3;
            System.out.println("You have to pay Rs. "+bill);
        }

        else if (unit <= 200) {
            bill = 50*3 + (unit-50)*4.80;
            System.out.println("You have to pay Rs. "+bill);
        }

        else if (unit <= 400) {
            bill = (50*3) + (150*4.8) + (unit-200)*5.80;
            System.out.println("You have to pay Rs. "+bill);
        }

        else {
            bill = (50*3) + (150*4.8) + (200*5.80) + (unit-400)*6.20;
            System.out.println("You have to pay Rs. "+bill);
        }
    }
}