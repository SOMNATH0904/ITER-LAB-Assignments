package Assignment4;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int pow = 1;
        while(3*pow <= num) {
            pow = pow*3;
        }
        if(num < 3) {
            pow = 0;
        }
        System.out.println("The value obtained by largest power of 3 less than or equal to "+num+" is : "+pow);
    }
}
