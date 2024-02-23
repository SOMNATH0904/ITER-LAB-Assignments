// Question 10 : Write a Java program that reads two float numbers and checks whether the difference between these two numbers is less than ϵ (ϵ < 1).

import java.util.Scanner;

public class Q10 {

    public static boolean isDifferenceLessThanEpsilon(float num1, float num2, float epsilon) {
        int floatBits1 = Float.floatToIntBits(num1);
        int floatBits2 = Float.floatToIntBits(num2);
        int diff = Math.abs(floatBits1 - floatBits2);
        return diff < Float.floatToIntBits(epsilon);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first float number: ");
        float n1 = sc.nextFloat();
        System.out.print("Enter second float number: ");
        float n2 = sc.nextFloat();
        float epsilon = 0.1f;
        boolean result = isDifferenceLessThanEpsilon(n1, n2, epsilon);
        System.out.println("Is the difference less than epsilon? " + result);
    }
}
