package Assignment2;

import java.util.Scanner;

public class HAQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of minutes : ");
        int day1 = 24*60;
        int year1 = day1*365;
        int min = sc.nextInt();
        int year = min/year1;
        int days = (min-(year1*year))/day1;
        System.out.println(min+" minutes is approximately "+year+" years and "+days+" days");
    }
}
