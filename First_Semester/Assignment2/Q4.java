package Assignment2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 1000 :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int first_digit = number % 10;
        number = number / 10;
        int second_digit = number % 10;
        number = number / 10;
        int third_digit = number % 10;
        number = number / 10;
        int fourth_digit = number % 10;
        int sum_of_digits = (first_digit + second_digit + third_digit + fourth_digit);
        System.out.println ("The Sum of Digits is :"+sum_of_digits);
    }
}