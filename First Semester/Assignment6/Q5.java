package Assignment6;

import java.util.Scanner;

public class Q5 {

    public static double area(int n, double side) {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Sides : ");
        int n = sc.nextInt();
        System.out.println("Enter Length of each Side : ");
        double side = sc.nextDouble();
        double polygonArea = area(n, side);
        System.out.println("The area of the regular polygon is: "+polygonArea);
    }
}
