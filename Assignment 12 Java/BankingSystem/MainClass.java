package BankingSystem;

public class MainClass {
    public static void main(String[] args) {
        Account current = new Account() {

            @Override
            public void displayDetails() {
                System.out.println("current account details");
            }

            @Override
            public void calculateInterest() {
                System.out.println("current saving account");
            }
        };

        Account saving = new Account() {

            @Override
            public void displayDetails() {
                System.out.println("saving account details");
            }

            @Override
            public void calculateInterest() {
                System.out.println("calculating saving account");
            }
        };
    }
}
