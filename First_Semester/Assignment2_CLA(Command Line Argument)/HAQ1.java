package Assignment2_CommandLineArgument;

public class HAQ1 {
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double SI = (p*r*t)/100;
        System.out.println("The Principal is : "+p+" rate is : "+r+" time is : "+t+" So, The Simple Interest is : "+SI);
    }
}
