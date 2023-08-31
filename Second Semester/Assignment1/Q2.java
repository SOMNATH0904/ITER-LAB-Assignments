import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Weight in Kg : ");
        float weight = sc.nextFloat();

        System.out.println("Enter Height in metres : ");
        float height = sc.nextFloat();

        float BMI = weight / (height * height);

        if(BMI < 18.5) {
            System.out.println("Underweight");
        }

        else if(BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Normal Weight");
        }

        else if(BMI >= 25 && BMI <= 29.9) {
            System.out.println("Overweight");
        }

        else {
            System.out.println("Obese");
        }
    }
}