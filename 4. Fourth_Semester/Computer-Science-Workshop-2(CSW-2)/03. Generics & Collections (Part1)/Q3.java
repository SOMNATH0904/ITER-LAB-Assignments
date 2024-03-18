class Car implements Comparable<Car> {
    String model;
    String color;
    double speed;

    Car(String model, String color, double speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public int compareTo(Car otherCar) {
        if (this.speed < otherCar.speed)
            return -1;
        else if (this.speed > otherCar.speed)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Model: "+model+" Color: "+color+" Speed: "+speed+" km/h";
    }
}

public class Q3 {
    public static void main(String[] args) {
        Car car1 = new Car("Tata Nexon", "Blue", 180.0);
        Car car2 = new Car("Mahindra XUV 700", "Red", 160.0);

        int comparisonResult = car1.compareTo(car2);
        if (comparisonResult < 0) {
            System.out.println("Car 2 has a greater speed -->");
            System.out.println(car2);
        } else if (comparisonResult > 0) {
            System.out.println("Car 1 has a greater speed -->");
            System.out.println(car1);
        } else {
            System.out.println("Both cars have the same speed -->");
        }
    }
}
