//3. Find the Kth largest and Kth smallest number in an array	

#include <stdio.h>

void bubbleSort(int arr[], int size) {
    for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

int main() {
    int size, k;

    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int arr[size];
    printf("Enter the elements of the array: ");
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter the value of K: ");
    scanf("%d", &k);

    bubbleSort(arr, size);

    int kthLargest = arr[size - k];
    int kthSmallest = arr[k - 1];

    printf("Kth largest number: %d\n", kthLargest);
    printf("Kth smallest number: %d\n", kthSmallest);

    return 0;
}
