/*
Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a
java program to display area of different shapes.
*/

abstract class Shape {
    abstract double getArea();

    public static void main(String[] args) {
        Square s = new Square(7);
        System.out.println("Area of Square is : "+s.getArea());

        Triangle t = new Triangle(5, 3);
        System.out.println("Area of Triangle is : "+t.getArea());

        Circle c = new Circle(6);
        System.out.println("Area of Circle is : "+c.getArea());
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    double getArea() {
        return side * side;
    }
}

class Triangle extends Shape {
    double height;
    double width;

    Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    double getArea() {
        return 0.5 * height * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}