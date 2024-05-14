package Assign_13_4;

public class Display extends Thread {
    private BankAccount account;
    private double amount;

    public Display(BankAccount account, double amount){
        this.account=account;
        this.amount=amount;
    }
    public void run(){
        try {
            account.deposit(amount);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            account.withdraw(amount);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

