package Assignment2_CommandLineArgument;

public class Q2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = (int) Math.pow(a,b);
        System.out.println(a+" to the power "+b+" is : "+c);
    }
}
