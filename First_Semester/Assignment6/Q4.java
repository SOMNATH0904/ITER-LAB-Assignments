package Assignment6;

import java.util.Scanner;

public class Q4 {

    public static int numberOfDaysInAYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return 366; // Leap year
        } else {
            return 365; // Non-leap year
        }
    }

    public static void main(String[] args) {
        for (int year = 2000; year <= 2020; year++) {
            int days = numberOfDaysInAYear(year);
            System.out.println(year+" has "+days+" days.");
        }
    }
}
