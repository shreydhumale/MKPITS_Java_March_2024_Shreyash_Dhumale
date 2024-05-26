/* Write a program that determines the eligibility of a person for a discount
   based on their total purchase amount at a store using if statements*/
   
#include <stdio.h>

int main() {
    float total_purchase_amount;
    
    printf("Enter total purchase amount:");
    scanf("%f", &total_purchase_amount);
    
    if (total_purchase_amount >= 1000) {
        printf("You are eligible for a discount.\n");
    } else {
        printf("you are not eligible for a discount.\n");
    }
    
    return 0;
}
