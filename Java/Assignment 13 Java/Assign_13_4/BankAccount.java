package Assign_13_4;

public class BankAccount extends Thread implements Runnable{
    private double balance;

    public BankAccount(double initailBalance){
        this.balance=initailBalance;
    }
    public synchronized void deposit(double depositAmt) throws InterruptedException {
        balance+=depositAmt;
        System.out.println("deposit Amount="+depositAmt);
        System.out.println("Current balance=" +balance);
    }
    public synchronized void withdraw(double withdrawAmt) throws InterruptedException {
        balance-= withdrawAmt;
        System.out.println("withdrawl Amount="+withdrawAmt);
        System.out.println("Current balance=" +balance);
        }
        public synchronized double getBalance(){
        return balance;
    }
}
