//9. Find the first non-repeating element in a given array of integers

#include <stdio.h>

int findFirstNonRepeating(int arr[], int size) {
    int hash[100000] = {0}; 

    for (int i = 0; i < size; i++) {
        hash[arr[i]]++;
    }

    for (int i = 0; i < size; i++) {
        if (hash[arr[i]] == 1) {
            return arr[i];
        }
    }

    return -1;
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

    int firstNonRepeating = findFirstNonRepeating(arr, size);

    if (firstNonRepeating != -1) {
        printf("First non-repeating element in the array: %d\n", firstNonRepeating);
    } else {
        printf("No non-repeating elements found in the array.\n");
    }

    return 0;
}
