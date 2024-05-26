//9. Create a program that simulates a basic ATM machine allowing users to withdraw, deposit, and check balance based on user input using if statements.

#include <stdio.h>

int main() {
    float balance = 1000.0;

    int choice;
    float amount;

    while (1) {
        printf("\n");
        printf("1. Check Balance\n");
        printf("2. Deposit\n");
        printf("3. Withdraw\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice == 1) {
            printf("Your balance is: $%.2f\n", balance);
        } else {
            if (choice == 2) {
                printf("Enter the amount to deposit: $");
                scanf("%f", &amount);
                if (amount > 0) {
                    balance += amount;
                    printf("Deposit of $%.2f successful.\n", amount);
                } else {
                    printf("Invalid amount.\n");
                }
            } else {
                if (choice == 3) {
                    printf("Enter the amount to withdraw: $");
                    scanf("%f", &amount);
                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        printf("Withdrawal of $%.2f successful.\n", amount);
                    } else {
                        printf("Insufficient funds or invalid amount.\n");
                    }
                } else {
                    if (choice == 4) {
                        printf("Thank you for using the ATM. Goodbye!\n");
                        return 0;
                    } else {
                        printf("Invalid choice. Please try again.\n");
                    }
                }
            }
        }
    }

    return 0;
}
