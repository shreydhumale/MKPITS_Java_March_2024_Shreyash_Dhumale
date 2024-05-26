//8.Implement a program that calculates the total cost of a meal at a restaurant including tax and tip based on the menu items ordered and their prices using if statements.

#include <stdio.h>

int main() {
    float burgerPrice = 5.99;
    float friesPrice = 2.49;
    float drinksPrice = 1.99;
    float taxRate = 0.06;
    float tipRate = 0.15; 

    int burger, fries, drink;

    printf("Enter the quantity of burgers: ");
    scanf("%d", &burger);
    printf("Enter the quantity of fries: ");
    scanf("%d", &fries);
    printf("Enter the quantity of drinks: ");
    scanf("%d", &drink);

    float subtotal = burger * burger + fries * friesPrice + drinksPrice;

    float tax = taxRate * subtotal;

    float tip = tipRate * subtotal;

    float totalCost = subtotal + tax + tip;

    printf("Subtotal: $%.2f\n", subtotal);
    printf("Tax (6%%): $%.2f\n", tax);
    printf("Tip (15%%): $%.2f\n", tip);
    printf("-----------------------\n");
    printf("Total Cost: $%.2f\n", totalCost);

    return 0;
}
