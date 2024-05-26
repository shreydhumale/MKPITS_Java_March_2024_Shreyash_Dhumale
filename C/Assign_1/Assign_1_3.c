//3. Write a program that calculates the net salary of an employee based on their basic salary, allowances, and deductions using if statements.

#include <stdio.h>

int main() {
    float basicSalary, allowances, deductions, netSalary;

    printf("Enter the basic salary of the employee: ");
    scanf("%f", &basicSalary);
    printf("Enter the allowances: ");
    scanf("%f", &allowances);
    printf("Enter the deductions: ");
    scanf("%f", &deductions);

    netSalary = basicSalary + allowances - deductions;

    if (netSalary < 0) {
        printf("Error\n");
    } else {
        printf("Net Salary: %.2f\n", netSalary);
    }

    return 0;
}
