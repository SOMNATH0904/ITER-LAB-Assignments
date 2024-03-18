interface Vehicle {
    void accelerate();
    void brake();
}
class Car1 implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Car is Braking");
    }

    public void accelerate(int speed) {
        System.out.println("Car is accelerating at "+speed+" km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating to "+speed+" km/h for "+duration+" seconds.");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is Speeding Up");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is Applying Brakes");
    }

    public void accelerate(int speed) {
        System.out.println("Bicycle is Accelerating at "+speed+" km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating to "+speed+" km/h for "+duration+" seconds");
    }
}

public class Q8 {
    public static void main(String[] args) {
        Car1 car = new Car1();
        System.out.println("Car Actions -->");
        car.accelerate();
        car.brake();
        car.accelerate(80);
        car.accelerate(100, 10);
        System.out.println();

        Bicycle bicycle = new Bicycle();
        System.out.println("Bicycle Actions -->");
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate(30);
        bicycle.accelerate(40, 5);
    }
}
