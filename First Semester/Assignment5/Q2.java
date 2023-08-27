package Assignment5;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int a = num;
        int reverse, sum=0;

        while(num != 0) {
            reverse = num%10;
            sum = sum*10+reverse;
            num = num/10;
        }
        int flag = 0;
        for(int i = 2; i <= sum/2; i++) {
            if(sum%i == 0) {
                flag = 1;
                break;
            }
        }
        if(flag == 0) {
            System.out.println(a+" is a Twisted prime");
        }
        else {
            System.out.println(a+" is not a Twisted prime");
        }
    }
}