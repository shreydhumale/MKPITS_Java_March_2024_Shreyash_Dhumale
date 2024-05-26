// Create a program to merge two arrays into a single array.

#include <stdio.h>
int main() {
    int n1, n2;

    printf("Enter the size of the first array: ");
    scanf("%d", &n1);

    int arr1[n1];
    printf("Enter elements for the first array:\n", n1);
    for (int i = 0; i < n1; i++) {
        scanf("%d", &arr1[i]);
    }

    printf("Enter the size of the second array: ");
    scanf("%d", &n2);

    int arr2[n2];
    printf("Enter  elements for the second array:\n", n2);
    for (int i = 0; i < n2; i++) {
        scanf("%d", &arr2[i]);
    }

    int mergedSize = n1 + n2;
    int mergedArray[mergedSize];
    for (int i = 0; i < n1; i++) {
        mergedArray[i] = arr1[i];
    }
    for (int i = 0; i < n2; i++) {
        mergedArray[n1 + i] = arr2[i];
    }

    printf("Merged array:\n");
    for (int i = 0; i < mergedSize; i++) {
        printf("%d ", mergedArray[i]);
    }
    printf("\n");

    return 0;
}
