//6. Count Pairs with the given sum

#include <stdio.h>

int countPairsWithSum(int arr[], int size, int targetSum) {
    int count = 0;

    for (int i = 0; i < size - 1; i++) {
        for (int j = i + 1; j < size; j++) {
            if (arr[i] + arr[j] == targetSum) {
                count++;
            }
        }
    }

    return count;
}

int main() {
    int size, targetSum;

    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int arr[size];
    printf("Enter the elements of the array: ");
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter the target sum: ");
    scanf("%d", &targetSum);

    int pairsCount = countPairsWithSum(arr, size, targetSum);

    printf("Number of pairs with the given sum: %d\n", pairsCount);

    return 0;
}
