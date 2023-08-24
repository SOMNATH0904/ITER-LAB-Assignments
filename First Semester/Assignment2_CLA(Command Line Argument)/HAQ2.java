package Assignment2_CommandLineArgument;

public class HAQ2 {
    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]);
        double h = Double.parseDouble(args[1]);
        double Surface_Area = ((Math.PI*Math.pow(r,2)) + (2*Math.PI*r*h));
        System.out.println("The Radius is : "+r+" and the height is : "+h+" So, The Surface Area of Cylinder is : "+Surface_Area);
    }
}
