//8. Find the first repeating element in an array of integers

#include <stdio.h>

int findFirstRepeating(int arr[], int size) {
    int minIndex = -1;
    int hash[100000] = {0};

    for (int i = size - 1; i >= 0; i--) {
        if (hash[arr[i]] != 0) {
            minIndex = i;
        } else {
            hash[arr[i]] = 1;
        }
    }

    return (minIndex != -1) ? arr[minIndex] : -1;
}

int main() {
    int size;

    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int arr[size];
    printf("Enter the elements of the array: ");
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    int firstRepeating = findFirstRepeating(arr, size);

    if (firstRepeating != -1) {
        printf("First repeating element in the array: %d\n", firstRepeating);
    } else {
        printf("No repeating elements found in the array.\n");
    }

    return 0;
}
