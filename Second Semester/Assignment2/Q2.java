package Assignment2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter the distance in km:");
        Scanner sc= new Scanner(System.in);
        double dist_km = sc.nextDouble();
        double dist_meter = dist_km*1000;
        double dist_inch = dist_km*39370.0787;
        double dist_feet = dist_km*3280.8399;
        double dist_cent = dist_km*100000;

        System.out.println(dist_km+" in meter will be "+dist_meter);
        System.out.println(dist_km+" in inch will be "+dist_inch);
        System.out.println(dist_km+" in feet will be "+dist_feet);
        System.out.println(dist_km+" in cent will be "+dist_cent);
    }
}
