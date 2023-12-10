package Assignment2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Enter your Basic Salary :");
        Scanner sc = new Scanner(System.in);
        double Salary = sc.nextDouble();
        double DA = Salary * 40 / 100;
        System.out.println("Your DA will be :"+DA);
        double HRA = Salary * 20 / 100;
        System.out.println("Your HRA will be :"+HRA);
        double GrossSalary = Salary + DA + HRA;
        System.out.println("Your Gross Salary will be :"+GrossSalary);
    }
}