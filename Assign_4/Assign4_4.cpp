//Write a C program to check if an array is palindrome or not

#include <stdio.h>

int main() {
    int n;
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements: ", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int start = 0;
    int end = n - 1;
    int isPalindrome = 1; 
    
    while (start < end) {
        if (arr[start] != arr[end]) {
            isPalindrome = 0; 
            break;
        }
        start++;
        end--;
    }

    if (isPalindrome) {
        printf("The array is a palindrome.\n");
    } else {
        printf("The array is not a palindrome.\n");
    }

    return 0;
}
