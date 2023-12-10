package Assignment2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter a value of temperature in Farenheit:");
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        double temp2;
        temp2 = (temp-32)*(5.0/9);
        System.out.println("The value of temperature in celsius is:"+temp2);
    }
}