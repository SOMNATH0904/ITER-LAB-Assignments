class Car {
    private String make;
    private String model;

    Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    String getMake() {
        return make;
    }

    void setMake(String make) {
        this.make = make;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }
}

public class CarTester {
    public static void main(String[] args) {
        Car myCar1 = new Car("Tata", "Nexon"); // My Favourite hehehehe ...

        Car myCar2 = new Car(null, null);

        System.out.println("Initial make and model of myCar1 is : "+myCar1.getMake()+" "+myCar1.getModel());
        System.out.println("Initial make and model of myCar2 is : "+myCar2.getMake()+" "+myCar2.getModel());

        myCar2.setMake("Mahindra");
        myCar2.setModel("XUV700");

        System.out.println("Updated make and model of myCar2 is : "+myCar2.getMake()+" "+myCar2.getModel());
    }
}
