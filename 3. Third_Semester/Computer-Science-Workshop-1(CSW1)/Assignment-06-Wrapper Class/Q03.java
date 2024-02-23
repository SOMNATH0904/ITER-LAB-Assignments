// Question 3 : Write a program to convert a double to a Double object.

public class Q03 {
    public static void main(String[] args) {
        double num = 6.28;
        Double doubleObject = Double.valueOf(num);
        System.out.println("Double Object: " + doubleObject);
    }
}
