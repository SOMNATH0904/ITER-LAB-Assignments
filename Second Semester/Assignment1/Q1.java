import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int count = 0;
        while(n > 2) {
            n = n / 2;
            count++;
        }
        System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is : "+count);
    }
}