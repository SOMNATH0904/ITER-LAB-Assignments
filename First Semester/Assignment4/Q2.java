package Assignment4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0, ln, r;
        ln = num;
        while(num != 0) {
            r = num%10;
            sum = sum+r;
            num = num/10;
        }
        if(sum%9 == 0) {
            System.out.println("The Number "+ln+" is divisible by 9");
        } else {
            System.out.println("The Number "+ln+" is divisible by 9");
        }
    }
}