package Assignment4;

import java.util.Scanner;

public class HAQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last Number : ");
        int num = sc.nextInt();
        int sum = 0, pow = 0;
        for(int i = 1; i <= num; i++) {
            sum = sum+i;
            pow = pow+(i*i);
        }
        int p = (int) (Math.pow(sum,2));
        int s = p-pow;
        System.out.println("The Sum of the Squares of the first "+num+" natural numbers is : "+pow);
        System.out.println("The Square of the Sum of the first "+num+" natural numbers is : "+p);
        System.out.println("Hence, the difference between the Sum of the Squares of the first "+num+" natural numbers and Square of the Sum is : "+s);
    }
}
