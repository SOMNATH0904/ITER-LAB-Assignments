package Assignment2_CommandLineArgument;

public class Q5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[0]);
        int m1 = Math.max(a,b);
        int max = Math.max(m1,c);
        int m2 = Math.min(a,b);
        int min = Math.min(m2,c);
        int mid = (a+b+c)-(max+min);
        System.out.println("The numbers in ascending order is : "+min+" "+mid+" "+max);
    }
}
