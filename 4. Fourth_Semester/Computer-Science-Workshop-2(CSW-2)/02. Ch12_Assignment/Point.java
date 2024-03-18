public class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point(Point other) {
        this.x = other.getX();
        this.y = other.getY();
    }

    double getX() {
        return x;
    }

    void setX(double x) {
        this.x = x;
    }

    double getY() {
        return y;
    }

    void setY(double y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        System.out.println("Initial point coordinates ->");
        System.out.println("X: "+point1.getX());
        System.out.println("Y: "+point1.getY());

        Point point2 = new Point(point1);
        System.out.println("Copied point coordinates ->");
        System.out.println("X: "+point2.getX());
        System.out.println("Y: "+point2.getY());

        point1.setX(5);
        point1.setY(6);

        System.out.println("After modification -->");
        System.out.println("Original point coordinates ->");
        System.out.println("X: "+point1.getX());
        System.out.println("Y: "+point1.getY());
        System.out.println("Copied point coordinates ->");
        System.out.println("X: "+point2.getX());
        System.out.println("Y: "+point2.getY());
    }
}
