/*
Define a class Deposit. The instance variable of the class Deposit are mentioned below.
Instance variable	--> Datatype
Principal			--> Long
Time				-->	Integer
rate				-->	Double
Total_amt			-->	Double

Initialize the instance variables Principal, Time, rate through constructors. Constructors are
overloaded with the following prototypes.
Constructor1: Deposit ( )
Constructor2: Deposit (long, int, double)
Constructor3: Deposit (long, int)
Constructor4: Deposit (long, double)
Apart from constructor, the other instance methods are (i) display ( ): to display the
value of instance variables, (ii) calc_amt( ) to calculate the total amount.
Total_amt = Principal + (Principal×rate×Time)/100;
*/

public class Deposit {
    long Principal;
    int Time;
    double rate;
    double Total_amt;

    Deposit() {
        Principal = 0;
        Time = 0;
        rate = 0;
    }

    Deposit(long amount, int t , double r) {
        Principal = amount;
        Time = t;
        rate = r;
    }

    Deposit(long amount, int t) {
        Principal = amount;
        Time = t;
        rate = 1;
    }

    Deposit(long amount, double r) {
        Principal = amount;
        rate = r;
        Time = 1;
    }

    void display() {
        System.out.println("Principal amount is : "+Principal);
        System.out.println("Time is : "+Time);
        System.out.println("Rate is : "+rate);
    }

    void calc_amt() {
        Total_amt = (Principal + (Principal * rate * Time) / 100);
        System.out.println("The Total Amount is : "+Total_amt);
    }

    public static void main(String[] args) {
        Deposit d1 = new Deposit();
        Deposit d2 = new Deposit(200, 2, 3);
        Deposit d3 = new Deposit(4000, 2);
        Deposit d4 = new Deposit(5000, 6.1);
        d1.display();
        d1.calc_amt();
        d2.display();
        d2.calc_amt();
        d3.display();
        d3.calc_amt();
        d4.display();
        d4.calc_amt();
    }
}

