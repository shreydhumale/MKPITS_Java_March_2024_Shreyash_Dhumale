4. Simple ATM Simulator: Design a basic ATM simulator that allows users to check their balance, withdraw money, and deposit money into their account.


import java.util.Scanner;

public class AtmSimulator {
    private float balance;

    public AtmSimulator(float initialBalance) {
        this.balance = initialBalance;
    }

    public float withdrawAmount() {
        System.out.println("Enter amount to withdraw:");
        Scanner scanner = new Scanner(System.in);
        float withdrawal = scanner.nextFloat();
        try {

            if (withdrawal > balance) {
                System.out.println("Insufficient funds. Withdrawal canceled.");
                return balance;
            }
        }

        }
        balance -= withdrawal;
        System.out.println("balance after withdrawl: " + balance);
        return balance;
    }

    public float depositAmount() {
        System.out.println("Enter amount to deposit:");
        Scanner scanner = new Scanner(System.in);
        float deposit = scanner.nextFloat();
        balance += deposit;
        System.out.println("balance after deposit: " + balance);
        return balance;
    }

    public float checkBalance() {
        System.out.println("Your current balance is: " + balance);
        return balance;
    }
}

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        AtmSimulator atm = new AtmSimulator(5000);
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("\n1. Withdraw Amount");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
        case 1:
        atm.withdrawAmount();
        break;
        case 2:
        atm.depositAmount();
        break;
        case 3:
        atm.checkBalance();
        break;
        case 4:
        System.out.println("Exiting ATM. Thank you!");
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
        }
        }
    }
}


