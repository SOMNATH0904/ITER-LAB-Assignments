/*
A phone number can be thought of as having three parts: the area code, the exchange code and
the number.
Example: A phone number, such as (212) 767-8900, can be thought of as having three parts:
the area code (212), the exchange (767) and the number (8900).
Define a class Phone to store these three parts of a phone number separately as instance
variable (area_code, exchange, number). The class consists of two member methods: input ( )
and display ( ). Create two class objects of type phone. Initialize one directly (by using dot (.)
operator and instance variable with value area_code: 212, exchange: 767,
number: 8900), and initialize other from the user through member method input ( ). Display
both the numbers.
*/

public class Phone {

    //Taking INSTANCE Variables
    int area_code;
    int exchange_code;
    int number;

    //Defining Method INPUT
    void input(int area_code, int exchange_code, int number) {
        this.area_code = area_code;
        this.exchange_code = exchange_code;
        this.number = number;
    }

    //Defining Method OUTPUT to show Result
    void display() {
        System.out.println("My Number is : ("+this.area_code+") "+this.exchange_code+"-"+this.number);
    }

    void display1() {
        System.out.println("Your Number is : ("+this.area_code+") "+this.exchange_code+"-"+this.number);
    }
    public static void main(String[] args) {

        //Instantiation Objects
        Phone p1 = new Phone();
        Phone p2 = new Phone();

        //Initialising Objects
        p1.area_code = 212;
        p1.exchange_code = 767;
        p1.number = 8900;
        p2.input(415, 555, 1212);

        //Displaying Objects
        p1.display();
        p2.display1();
    }

}