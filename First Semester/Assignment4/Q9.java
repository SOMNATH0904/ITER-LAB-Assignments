package Assignment4;

import  java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer Number : ");
        int num = sc.nextInt();
        int idx = 0;
        int new_number = 0;
        while(num > 0) {
            int rem = num%10;
            num = num/10;
            if(rem != 0) {
                new_number = new_number + (int)(rem*Math.pow(10, idx));
                idx++;
            }
        }
        System.out.println("After removing 0 from "+num+" The new number is : "+new_number);
    }
}