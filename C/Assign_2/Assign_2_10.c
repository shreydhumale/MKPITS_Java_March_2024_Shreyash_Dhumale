//10. Create a program to print all prime numbers between 1 and N.

#include <stdio.h>

int main() {
    int N;

    printf("Enter the value of N: ");
    scanf("%d", &N);

    printf("Prime numbers between 1 and %d are:\n", N);
    for (int i = 2; i <= N; i++) {
        int is_prime = 1;
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                is_prime = 0;
                break;
            }
        }
        if (is_prime) {
            printf("%d ", i);
        }
    }
    printf("\n");

    return 0;
}
