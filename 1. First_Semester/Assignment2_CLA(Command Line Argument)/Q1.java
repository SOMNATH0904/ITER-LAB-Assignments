package Assignment2_CommandLineArgument;

public class Q1 {
    public static void main(String[] args) {
        int dividend = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);
        int quotient = Integer.parseInt(args[2]);
        int remainder = Integer.parseInt(args[3]);
        System.out.println("The Dividend is : "+dividend);
        System.out.println("The Divisor is : "+divisor);
        System.out.println("The Quotient is : "+quotient);
        System.out.println("The Remainder is : "+remainder);
    }
}
