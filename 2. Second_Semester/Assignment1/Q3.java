import java.util.Scanner;

public class Q3 {

    static void SpyNumberOrNot(int n) {
        int sum = 0;
        int product = 1;
        int num = n;
        while(n > 0) {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n = n / 10;
        }
        if(sum == product) {
            System.out.println(num+" is a Spy Number");
        }
        else {
            System.out.println(num+" is not a Spy Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        SpyNumberOrNot(n);

    }

}