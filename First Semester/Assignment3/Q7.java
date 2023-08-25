package Assignment3;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your power consumption unit :");
        int unit = sc.nextInt();
        double Bill = 0;
        if (unit <= 50) {
            Bill = unit*3;
            System.out.println("You have to pay Rs. "+Bill);
        }
        else if (unit <= 200) {
            Bill = 50*3 + (unit-50)*4.80;
            System.out.println("You have to pay Rs. "+Bill);
        }
        else if (unit <= 400) {
            Bill = (50*3) + (150*4.8) + (unit-200)*5.80;
            System.out.println("You have to pay Rs. "+Bill);
        }
        else {
            Bill = (50*3) + (150*4.8) + (200*5.80) + (unit-400)*6.20;
            System.out.println("You have to pay Rs. "+Bill);
        }
        System.out.println("Do you Want to pay online :");
        char choice = sc.next().charAt(0);
        switch(choice) {
            case 'y' : {
                double discount = Bill*3/100;
                double New_Bill = Bill-discount;
                System.out.println("Your Discount is Rs. "+discount);
                System.out.println("You have to pay :"+New_Bill);
                break;

            }
            case 'n' : {
                System.out.println("You have to pay Rs. " + Bill);
            }
        }
    }
}