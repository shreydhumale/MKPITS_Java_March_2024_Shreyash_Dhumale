//1. Create a program to count the number of digits in a given number.


#include <stdio.h>

int main() {
	int num;
    int count = 0;

    printf("Enter a number: ");
    scanf("%lld", &num);

    while (num != 0) {
        count++;
        num /= 10;
    }

    printf("Number of digits: %d\n", count);

    return 0;
}
