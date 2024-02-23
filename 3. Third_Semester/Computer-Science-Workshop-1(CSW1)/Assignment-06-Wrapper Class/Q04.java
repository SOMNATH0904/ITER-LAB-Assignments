// Question 4 : Write a program to convert a boolean to a Boolean object.

public class Q04 {
    public static void main(String[] args) {
        boolean boolValue = true;
        Boolean booleanObject = Boolean.valueOf(boolValue);
        System.out.println("Boolean Object: " + booleanObject);
    }
}
