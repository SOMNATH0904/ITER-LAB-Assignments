abstract class  Account {
    private int accNumber;
    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    abstract void deposit();
    abstract void withdraw();
}

class SavingsAccount extends Account {
    int intRate;

    public void setIntRate(int intRate){
        this.intRate = intRate;
    }

    void deposit(){
        int interest = getBalance() * intRate/100;
        System.out.println("The Interest deposited : "+interest);
    }

    void withdraw() {
        System.out.println("Withdrawn amount is : "+intRate);
    }

}

class CurrentAccount extends Account {
    int overDLimit;

    public void setOverDraftLimit(int overDLimit){
        this.overDLimit = overDLimit;
    }

    void deposit() {
        int interest = getBalance() * overDLimit;
        System.out.println("Amount Deposited is : "+interest);
    }
    
    void withdraw() {
        System.out.println("Withdrawn amount is : "+overDLimit);
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        SavingsAccount s1=new SavingsAccount();
        CurrentAccount c1=new CurrentAccount();

        s1.setBalance(5000);
        s1.setIntRate(4);
        s1.deposit();
        s1.withdraw();

        c1.setBalance(40000);
        c1.setOverDraftLimit(3);
        c1.deposit();
        c1.withdraw();
    }
}