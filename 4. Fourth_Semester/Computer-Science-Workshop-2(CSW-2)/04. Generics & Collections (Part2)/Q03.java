/**
 * Ques 3 : Write a Java code snippet that comprises of a Car class and a CarApp class. The Car class should define private fields for ModalNo(int), name(string) and stock(int). Define a parameterised constructor and override the compareTo method as public int compareTo(Car car) to sort the car on basis of the total number of stock. Create an ArrayList of Car objects and print the updated the sorted list.
 * For example the list of sorted Car Objects
 * 2013 creta 10
 * 2020 MG 13
 * 2018 Kia 20
 * 2017 Audi 45
 * 2015 BMW 55
 */

import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
    private int modalNo;
    private String name;
    private int stock;

    Car(int modalNo, String name, int stock) {
        this.modalNo = modalNo;
        this.name = name;
        this.stock = stock;
    }
    public int getModalNo() {
        return modalNo;
    }
    public String getName() {
        return name;
    }
    public int getStock() {
        return stock;
    }
    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.stock, car.stock);
    }
    public String toString() {
        return modalNo + " " + name + " " + stock;
    }
}
public class Q03 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(2013, "Creta", 10));
        cars.add(new Car(2020, "MG", 13));
        cars.add(new Car(2018, "Kia", 20));
        cars.add(new Car(2017, "Audi", 45));
        cars.add(new Car(2015, "BMW", 55));
        Collections.sort(cars);
        System.out.println("List of sorted Car Objects --> ");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

/**
 * OUTPUT :
 *
 * List of sorted Car Objects -->
 * 2013 Creta 10
 * 2020 MG 13
 * 2018 Kia 20
 * 2017 Audi 45
 * 2015 BMW 55
 */