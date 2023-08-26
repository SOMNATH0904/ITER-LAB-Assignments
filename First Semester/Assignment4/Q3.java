package Assignment4;

import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rn, sum = 0, i = 1;
        double avg;
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        System.out.print("The Random Numbers are : ");
        do {
            rn = (int)(Math.random()*num)+1;
            System.out.print(rn + " ");
            sum = sum+rn;
            i++;
        } while(i <= num);
        avg = (sum+1.0)/6;
        System.out.println("\nAverage of the "+num+" Random Numbers are : "+avg);
    }
}