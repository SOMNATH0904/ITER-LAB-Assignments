package Assignment4;

import java.util.Scanner;

public class HAQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0, prd = 1;
        System.out.println("Enter the Number : ");
        num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            if(i%2 == 0) {
                sum += i;
            } else {
                prd *= i;
            }
        }
        System.out.println("The Sum of all Even numbers between 1 to "+num+" is : "+sum);
        System.out.println("The Product of all Odd numbers between 1 to "+num+" is : "+prd);
    }
}
