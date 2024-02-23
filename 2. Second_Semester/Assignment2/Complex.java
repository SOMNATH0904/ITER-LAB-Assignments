/*
Define a class called Complex with instance variables real, imag and instance methods
setData(), display(), add(). Write a Java program to add two complex numbers.
The prototype of add method is:
public Complex add(Complex, Complex).
*/

import java.util.Scanner;

public class Complex {

    int real;
    int imag;

    void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Real part of the number : ");
        real = sc.nextInt();
        System.out.println("Enter Imaginary part of the number : ");
        imag = sc.nextInt();
    }

    void display() {
        System.out.println("The Complex Number is : "+this.real+" + i"+this.imag);
    }

    void display1() {
        System.out.println("The Addition of Two Complex Number is : "+this.real+" + i"+this.imag);
    }

    public Complex add(Complex c1, Complex c2) {
        Complex sum = new Complex();
        sum.real = c1.real + c2.real;
        sum.imag = c1.imag + c2.imag;
        return sum;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex Result = new Complex();
        c1.setData();
        c2.setData();
        c1.display();
        c2.display();

        Result = Result.add(c1, c2);
        Result.display1();

    }

}