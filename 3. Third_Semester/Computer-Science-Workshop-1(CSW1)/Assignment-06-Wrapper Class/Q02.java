// Question 2 : Write a program to convert a float to a Float object.

public class Q02 {
    public static void main(String[] args) {
        float num = 3.14f;
        Float floatObject = Float.valueOf(num);
        System.out.println("Float Object: "+floatObject);
    }
}
