package Assignment2;

import java.util.Scanner;

public class HAQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three points for a triangle : ");
        double x1 = sc.nextFloat();
        double y1 = sc.nextFloat();
        double x2 = sc.nextFloat();
        double y2 = sc.nextFloat();
        double x3 = sc.nextFloat();
        double y3 = sc.nextFloat();
        double side1 = Math.sqrt(Math.abs(Math.pow((x2-x1),2) + Math.pow((y2-y1),2)));
        double side2 = Math.sqrt(Math.abs(Math.pow((x3-x1),2) + Math.pow((y3-y1),2)));
        double side3 = Math.sqrt(Math.abs(Math.pow((x3-x2),2) + Math.pow((y3-y2),2)));
        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(Math.abs(s*(s-side1)*(s-side2)*(s-side3)));
        System.out.println("The Area of Triangle is : "+area);
    }
}
