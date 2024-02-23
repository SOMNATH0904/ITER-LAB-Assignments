package HomeAssignment;

import java.util.Scanner;

class InvalidBalanceException extends Exception {
    public InvalidBalanceException(String msg) {
        super(msg);
    }
}

class Bank {
    String name;
    int account_no;
    double balance;

    Bank(String name, int account_no, double balance) {
        this.name = name;
        this.account_no = account_no;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Details of Account Holder ->");
        System.out.println("Name : "+name);
        System.out.println("Account Number : "+account_no);
        System.out.println("Balance : "+balance);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of Customer -> Name - AccountNo - Balance ->");
        Bank C1 = new Bank(sc.nextLine(), sc.nextInt(), sc.nextDouble());
        C1.display();
        System.out.println("Enter the Money to Withdraw : ");
        double withdraw = sc.nextDouble();
        double totalBalance = C1.balance - withdraw;
        try {
            if(totalBalance < 0) {
                throw new InvalidBalanceException("Balance cannot be less than 0");
            }
            System.out.println("After Withdraw, Balance : "+totalBalance);
        }
        catch(InvalidBalanceException e) {
            System.out.println(e);
        }
    }
}