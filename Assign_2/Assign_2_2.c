//2. Create a program to generate the Fibonacci series up to N terms using a do-while loop.

#include <stdio.h>

int main() {
    int N;
    long long int prev = 0, next = 1, fib;

    printf("Enter the number ");
    scanf("%d", &N);

    printf("Fibonacci series up to %d terms:\n", N);
    printf("%lld, %lld, ", prev, next);

    int count = 2;
    do {
        fib = prev + next;
        printf("%lld, ", fib);
        prev = next;
        next = fib;
        count++;
    } while (count < N);

    printf("\n");

    return 0;
}
