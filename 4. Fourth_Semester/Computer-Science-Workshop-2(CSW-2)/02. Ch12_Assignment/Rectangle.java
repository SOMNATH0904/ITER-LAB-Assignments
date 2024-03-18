public class Rectangle {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getLength() {
        return length;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);

        System.out.println("Length : "+rectangle.getLength());
        System.out.println("Width : "+rectangle.getWidth());

        System.out.println("The Area of Rectangle is : "+rectangle.calculateArea());
        System.out.println("The Perimeter of Rectangle is : "+rectangle.calculatePerimeter());
    }
}
