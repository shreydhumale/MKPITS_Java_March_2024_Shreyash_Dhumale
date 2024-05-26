//4. Find the Union and Intersection of the two sorted arrays

#include <stdio.h>

void findUnion(int arr1[], int arr2[], int m, int n) {
    int i = 0, j = 0;

    printf("Union of the two arrays: ");

    while (i < m && j < n) {
        if (arr1[i] < arr2[j]) {
            printf("%d ", arr1[i]);
            i++;
        } else if (arr1[i] > arr2[j]) {
            printf("%d ", arr2[j]);
            j++;
        } else {
            printf("%d ", arr1[i]);
            i++;
            j++;
        }
    }

    while (i < m) {
        printf("%d ", arr1[i]);
        i++;
    }
    while (j < n) {
        printf("%d ", arr2[j]);
        j++;
    }

    printf("\n");
}

void findIntersection(int arr1[], int arr2[], int m, int n) {
    int i = 0, j = 0;

    printf("Intersection of the two arrays: ");

    while (i < m && j < n) {
        if (arr1[i] < arr2[j]) {
            i++;
        } else if (arr1[i] > arr2[j]) {
            j++;
        } else {
            printf("%d ", arr1[i]);
            i++;
            j++;
        }
    }

    printf("\n");
}

int main() {
    int m, n;

    printf("Enter the size of the first array: ");
    scanf("%d", &m);

    int arr1[m];
    printf("Enter the elements of the first array (in sorted order): ");
    for (int i = 0; i < m; i++) {
        scanf("%d", &arr1[i]);
    }

    printf("Enter the size of the second array: ");
    scanf("%d", &n);

    int arr2[n];
    printf("Enter the elements of the second array (in sorted order): ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr2[i]);
    }

    findUnion(arr1, arr2, m, n);
    findIntersection(arr1, arr2, m, n);

    return 0;
}
