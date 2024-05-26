//1. Find a peak element which is not smaller than its neighbors

#include <stdio.h>

int findPeak(int arr[], int size) {
    if (arr[0] >= arr[1]) {
        return arr[0];
    }
    if (arr[size - 1] >= arr[size - 2]) {
        return arr[size - 1];
    }

    for (int i = 1; i < size - 1; i++) {
        if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
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

    int peak = findPeak(arr, size);

    if (peak != -1) {
        printf("Peak element found: %d\n", peak);
    } else {
        printf("No peak element found.\n");
    }

    return 0;
}
