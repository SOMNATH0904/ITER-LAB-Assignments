package Assignment5;

import java.util.Scanner;

public class HAQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double x = sc.nextDouble();
        int i = 1;
        double s = x;
        double term = x;
        double error = 0.000001;
        while(Math.abs(term) > error) {
            i = i+2;
            term = -term * x/i*(i-1);
            s += term;
        }
        System.out.println("The Result of the Infinite Series will be : "+s);
    }
}
