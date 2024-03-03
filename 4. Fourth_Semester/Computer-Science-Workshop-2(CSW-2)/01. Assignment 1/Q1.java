import java.util.Random;

class Account {
    private int accNum;
    private int balance;

    Account() {
        Random random = new Random();
        int temp = 0;
        for(int i = 0; i < 3; i++) {
            temp += random.nextInt(50);
        }
        this.accNum = temp;
        this.balance = 0;
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

class BankApp {
    Account acc;
    BankApp(Account acc) {
        this.acc = acc;
    }

    void withdraw(int amount) {
        if(amount > acc.getBalance()) {
            System.out.println("Insufficient Balance");
        } else {
            acc.setBalance(acc.getBalance() - amount);
        }
    }

    void deposit(int amount) {
        acc.setBalance(acc.getBalance() + amount);
    }

    String printToString() {
        return "Account Number : "+acc.getAccNum()+" "+" having Balance : "+acc.getBalance();
    }
}

public class Q1 {
    public static void main(String[] args) {
        Account a1 = new Account();
        BankApp b1 = new BankApp(a1);
        b1.withdraw(100);
        System.out.println(b1.printToString());
        b1.deposit(1000);
        System.out.println(b1.printToString());
        b1.withdraw(700);
        System.out.println(b1.printToString());
    }
}
