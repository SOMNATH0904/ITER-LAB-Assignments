package Assignment6;

public class HAQ2 {

    public static double calculateVolume(double side) { // Volume of a cube
        return side * side * side;
    }

    public static double calculateVolume(double radius, String shape) { // Volume of a sphere
        if (shape.equals("sphere")) {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        } else {
            return 0.0; // Default value for unsupported shape
        }
    }

    public static double calculateVolume(double length, double breadth, double height, String shape) {
        if (shape.equals("cuboid")) {
            return length * breadth * height; // Volume of a cuboid
        } else {
            return 0.0; // Default value for unsupported shape
        }
    }

    public static void main(String[] args) {
        double cubeSide = 5.0;
        double sphereRadius = 3.0;
        double cuboidLength = 4.0;
        double cuboidBreadth = 6.0;
        double cuboidHeight = 8.0;

        double cubeVolume = calculateVolume(cubeSide);
        System.out.println("Volume of cube: " + cubeVolume);

        double sphereVolume = calculateVolume(sphereRadius, "sphere");
        System.out.println("Volume of sphere: " + sphereVolume);

        double cuboidVolume = calculateVolume(cuboidLength, cuboidBreadth, cuboidHeight, "cuboid");
        System.out.println("Volume of cuboid: " + cuboidVolume);
    }
}

