//9. WAF to accept 2 numbers as an argument and display all armstrong numbers lies between these 2 numbers.

#include <stdio.h>

int isArmstrong(int num) {
    int originalNum, remainder, result = 0;
    originalNum = num;

    while (originalNum != 0) {
        remainder = originalNum % 10;
        result += remainder * remainder * remainder;
        originalNum /= 10;
    }

    if (result == num)
        return 1; 
    else
        return 0; 
}

void displayArmstrongNumbers(int start, int end) {
    printf("Armstrong numbers between %d and %d are:\n", start, end);
    for (int i = start; i <= end; i++) {
        if (isArmstrong(i)) {
            printf("%d\n", i);
        }
    }
}

int main() {
    int num1, num2;

    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);

    displayArmstrongNumbers(num1, num2);

    return 0;
}
