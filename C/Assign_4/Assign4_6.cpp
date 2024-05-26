//6. Write a C program to find the frequency of each element in an array.


#include <stdio.h>

void findFrequency(int arr[], int size) {
    int freq[size];
    int visited = -1;

    for (int i = 0; i < size; i++) {
        int count = 1;
        for (int j = i + 1; j < size; j++) {
            if (arr[i] == arr[j]) {
                count++;
                freq[j] = visited;
            }
        }
        if (freq[i] != visited) {
            freq[i] = count;
        }
    }

    printf("Frequency of each element in the array:\n");
    for (int i = 0; i < size; i++) {
        if (freq[i] != visited) {
            printf("%d occurs %d time(s)\n", arr[i], freq[i]);
        }
    }
}

int main() {
    int size;
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int arr[size];
    printf("Enter %d elements: ", size);
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    findFrequency(arr, size);

    return 0;
}
