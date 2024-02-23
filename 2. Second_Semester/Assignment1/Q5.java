import java.util.Scanner;

public class Q5 {

    public static int sum_Of_Digits(int n) {
        int sum = 0;
        while(n > 0 || sum >= 9) {
            if(n == 0) {
                n = sum;
                sum = 0;
            }
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n= sc.nextInt();
        int ans = sum_Of_Digits(n);
        System.out.println("Sum of digits of "+n+" until the number is a single digit is : "+ans);

    }

}