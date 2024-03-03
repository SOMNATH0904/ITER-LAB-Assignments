import java.util.Random;

class Account1 {
    private int accNum;
    private int balance;

    Account1(int accNum, int balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    void setACcNum(int accNum) {
        this.accNum = accNum;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }

    int getAccNum() {
        return this.accNum;
    }

    int getBalance() {
        return this.balance;
    }
}

class BankApp1 extends Account1{
    BankApp1(int accNum, int balance) {
        super(accNum, balance);
    }

    void withdraw(int amount) {
        if(amount > this.getBalance()) {
            System.out.println("Insufficient Balance");
        } else {
            this.setBalance(this.getBalance() - amount);
        }
    }

    void deposit(int amount) {
        this.setBalance(this.getBalance() + amount);
    }

    String printToString() {
        return "Account Number : "+this.getAccNum()+" "+" having Balance : "+this.getBalance();
    }
}

public class Q4_Q1 {
    public static void main(String[] args) {
        Account1 a1 = new Account1(34656, 7600);
        BankApp1 b1 = new BankApp1(76677, 8777);
        b1.withdraw(100);
        System.out.println(b1.printToString());
        b1.deposit(1000);
        System.out.println(b1.printToString());
        b1.withdraw(700);
        System.out.println(b1.printToString());
    }
}
