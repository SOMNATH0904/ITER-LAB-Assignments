package Assignment3;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y Component of the point :");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x>0 && y>0) {
            System.out.println(x+","+y+" is in 1ST Quadrant");
        }
        else if (x<0 && y>0) {
            System.out.println(x+","+y+" is in 2ND Quadrant");
        }
        else if (x<0 && y<0) {
            System.out.println(x+","+y+" is in 3RD Quadrant");
        }
        else if (x>0 && y<0){
            System.out.println(x+","+y+" is in 4TH Quadrant");
        }
        else if (x==0 && y!=0) {
            System.out.println(x+","+y+" is on the Y-Axis");
        }
        else if (y==0 && x!=0) {
            System.out.println(x+","+y+" is on the X-Axis");
        }
        else if (x==0 && y==0){
            System.out.println(x+","+y+"is on the Origin");
        }
    }
}