#include <stdio.h>

int main() {
    float balance = 1000.0; 

    int choice;
    float amount;

    printf("Welcome to the ATM!\n");

    while (1) {
        printf("\n");
        printf("1. Check Balance\n");
        printf("2. Deposit\n");
        printf("3. Withdraw\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Your balance is: $%.2f\n", balance);
                break;
            case 2:
                printf("Enter the amount to deposit: $");
                scanf("%f", &amount);
                if (amount > 0) {
                    balance += amount;
                    printf("Deposit of $%.2f successful.\n", amount);
                } else {
                    printf("Invalid amount.\n");
                }
                break;
            case 3:
                printf("Enter the amount to withdraw: $");
                scanf("%f", &amount);
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    printf("Withdrawal of $%.2f successful.\n", amount);
                } else {
                    printf("Insufficient funds or invalid amount.\n");
                }
                break;
       
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }

    return 0;
}
