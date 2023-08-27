package Assignment5;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int firstnumber = sc.nextInt();
        System.out.println("Enter second number : ");
        int secondnumber = sc.nextInt();
        int sum_firstnumber = 0;
        int sum_secondnumber = 0;

        for(int i = 1; i <= firstnumber; i++) {
            if(firstnumber%i == 0) {
                sum_firstnumber = sum_firstnumber+i;
            }
        }
        for(int i = 1; i <= secondnumber; i++) {
            if(secondnumber%i == 0) {
                sum_secondnumber = sum_secondnumber+i;
            }
        }
        if(sum_firstnumber == sum_secondnumber) {
            System.out.println(firstnumber+" and "+secondnumber+" are Amicable numbers.");
        }else {
            System.out.println(firstnumber+" and "+secondnumber+" are not Amicable numbers.");
        }
    }
}
