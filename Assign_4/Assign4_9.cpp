// 9. Create a C program to rotate elements of an array by a given number of positions.

#include <stdio.h>

int main() {
    int size, k;
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int arr[size];
    printf("Enter %d elements for the array: ", size);
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter the number of positions to rotate the array: ");
    scanf("%d", &k);

    k = k % size;

    int temp[size];

    for (int i = 0; i < size; i++) {
        temp[(i + k) % size] = arr[i];
    }

    for (int i = 0; i < size; i++) {
        arr[i] = temp[i];
    }

    printf("Array after rotating by %d positions: ", k);
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
