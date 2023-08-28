package Assignment6;

public class Q10 {

    public static double calculateArea(double base, double height, String shape) {    // Area of Triangle
        if(shape.equals("triangle")) {
            return 0.5 * base * height;
        } else {
            return 0;
        }
    }

    public static double calculateArea(double side) {   // Area of Square
        return side * side;
    }

    public static double calculateArea(double radius, String shape) {   // Area of Circle
            if(shape.equals("circle")) {
                return Math.PI * radius * radius;
            } else {
                return 0;
            }
    }

    public static double calculateArea(double length, double width) {   // Area of Rectangle
        return length * width;
    }

    public static void main(String[] args) {
        double triangleArea = calculateArea(10.0, 15.0, "triangle");
        System.out.println("Area of Triangle: " + triangleArea);

        double squareArea = calculateArea(7.0);
        System.out.println("Area of Square: " + squareArea);

        double circleArea = calculateArea(5.0, "circle");
        System.out.println("Area of Circle: " + circleArea);

        double rectangleArea = calculateArea(8.0, 12.0);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
