//7. Find duplicates in an array

#include <stdio.h>

void findDuplicates(int arr[], int size) {
    printf("Duplicate elements in the array: ");
    for (int i = 0; i < size - 1; i++) {
        for (int j = i + 1; j < size; j++) {
            if (arr[i] == arr[j]) {
                printf("%d ", arr[i]);
                break; 
            }
        }
    }
    printf("\n");
}

int main() {
    int size;

    printf("Enter the size of the array: ");
    scanf("%d", &size);

    printf("Enter the elements of the array: ");
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    findDuplicates(arr, size);

    return 0;
}
