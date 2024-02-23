package Assignment4;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        for(int i = 1; i < num; i++) {
            if (num%i == 0) {
                sum += i;
            }
        }
        if(sum == num) {
            System.out.println(num+" is a Perfect Number");
        } else {
            System.out.println(num+" is not a Perfect Number");
        }
    }
}