/**
 * Ques 4 : Create a functional interface Shape with a method double area() and a default method void printArea(). Implement the interface using lambda expressions for different shapes. Define the Shape functional interface with an area method. Implement the interface for shapes like circle, square, and rectangle using lambda expressions. Use the default method to print the area of each shape.
 */

/**
 * CODE
 */

interface Shape {
    double area();
    default void printArea() {
        System.out.println(area());
    }
}

public class Q04 {
    public static void main(String[] args) {
        Shape circle = () -> Math.PI * Math.pow(5, 2);
        Shape square = () -> Math.pow(5, 2);
        Shape rectangle = () -> 5 * 10;

        System.out.print("Area of Circle : ");
        circle.printArea();
        System.out.print("Area of Square : ");
        square.printArea();
        System.out.print("Area of Rectangle : ");
        rectangle.printArea();
    }
}

/**
 * OUTPUT
 * 
 * Area of Circle : 78.53981633974483
 * Area of Square : 25.0
 * Area of Rectangle : 50.0
 */