import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Lucky Number : ");
        int n = sc.nextInt();
        try {
            if(n < 0) {
                throw new NumberFormatException("Negative Number");
            }
            System.out.println("Your Lucky Number : "+n);
        }
        catch(NumberFormatException e) {
            System.out.println(e);
        }
    }
}