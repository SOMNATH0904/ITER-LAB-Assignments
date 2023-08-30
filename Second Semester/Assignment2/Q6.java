package Assignment2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Seconds :");
        double sec = sc.nextDouble();
        double dist_travelled = (1.0/2) * 32.174 * sec * sec;
        System.out.println("Distace travelled will be :" +dist_travelled);
    }
}