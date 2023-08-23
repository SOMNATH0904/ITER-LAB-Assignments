package Assignment2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter the radius of hemisphere :");
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        double AreaHemisphere = 3 * 3.14 * rad * rad;
        System.out.println ("The Surface Area of Hemisphere is :"+AreaHemisphere);
        double VolHemisphere = (2.0/3) * Math.PI * Math.pow(rad,2);
        System.out.println ("The Volume Area of Hemisphere is :"+VolHemisphere);
    }
}