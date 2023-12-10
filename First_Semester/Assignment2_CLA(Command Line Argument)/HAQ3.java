package Assignment2_CommandLineArgument;

public class HAQ3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int first_no = n/1000;
        int last_no = n%10;
        int sum = first_no + last_no;
        System.out.println("Your four-digit number is : "+n+" and the Sum of the first and last digit of the number is : "+sum);
    }
}
