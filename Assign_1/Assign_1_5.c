//5. Develop a program that checks if a given number is a perfect square using if statements.

#include <stdio.h>

int main() {
    int number;
    
    printf("Enter a number: ");
    scanf("%d", &number);
    
    int isPerfectSquare = 0;

    for (int i = 1; i * i <= number; ++i) {
        if (i * i == number) {
            isPerfectSquare = 1;
            break;
        }
    }

    if (isPerfectSquare) {
        printf("%d is a perfect square.\n", number);
    } else {
        printf("%d is not a perfect square.\n", number);
    }

    return 0;
}

