package Assignment3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year :");
        int year = sc.nextInt();
        if (year%4 == 0) {
            if (year%100 == 0) {
                if (year%400 == 0) {
                    System.out.println(year+" is a Leap Year");
                }
                else {
                    System.out.println(year+" is not a Leap year");
                }
            }
            else {
                System.out.println(year+" is a Leap year");
            }
        }
        else {
            System.out.println(year+" is not a leap year");
        }
    }
}