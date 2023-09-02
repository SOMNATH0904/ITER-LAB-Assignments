/*
Define a class called product. Two instance variables of the class are pid (product-id) and
price (product price). It consists of one static variable tot_price (total price). Initialize the value
of instance variables through parameterized constructor. It consists of a display ( ) method to
display the value of instance variables. A person went to market and purchase 5 different
products. Using the above mentioned class, display the details of products that the person has
purchased. Also, determine how much total amount the person will pay for the purchase of 5
products.
*/

import java.util.Scanner;

public class Product {
    int pid;
    double price;
    static double tot_price;

    Product(int pid, double price){
        this.pid = pid;
        this.price = price;
        tot_price = tot_price + price;
    }

    void display() {
        System.out.println("The Product-ID is : "+this.pid+" and the Product Price is : "+this.price);
    }

    public static void main(String[] args) {
//		Product P1 = new Product(100, 24);
//		Product P2 = new Product(200, 54);
//		Product P3 = new Product(300, 65);
//		Product P4 = new Product(400, 84);
//		Product P5 = new Product(648, 99);
//		P1.display();
//		P2.display();
//		P3.display();
//		P4.display();
//		P5.display();

        Scanner sc = new Scanner(System.in);
        Product[] P = new Product[5];
        int PId;
        double Price;
        for(int i = 0; i < P.length; i++) {
            System.out.println("Enter Product-ID and Price of Product : ");
            PId = sc.nextInt();
            Price = sc.nextDouble();
            P[i] = new Product(PId, Price);
        }

        for(int i = 0; i < P.length; i++) {
            P[i].display();
        }


        System.out.println("Total Amount the person will pay for the purchase of 5 products is : "+tot_price);


    }

}