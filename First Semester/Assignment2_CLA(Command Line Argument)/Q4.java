package Assignment2_CommandLineArgument;

public class Q4 {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double t1 = Math.toRadians(t);
        double result1 = Math.cos(5*t1);
        double result2 = Math.sin(7*t1);
        double result = result1 + result2;
        System.out.println("The value of cos(5t) and sin(7t) is : "+result);
    }
}
