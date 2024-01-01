import java.util.Scanner;

public class Q7 {

    public static int factorial(int n) {
        int ans = 1;
        for(int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("The Factorial of "+n+" is  : "+factorial(n));
    }
}
