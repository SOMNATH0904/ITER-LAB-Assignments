import java.util.Scanner;

public class Q8 {

    public static void reverse(int n) {
        if(n == 0)  return;
        System.out.print(n%10);
        reverse(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to Reverse : ");
        int n = sc.nextInt();
        System.out.print("The Reverse of a Number is : ");
        reverse(n);
    }
}