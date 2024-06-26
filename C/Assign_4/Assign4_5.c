// Develop a program to remove duplicate elements from an array

#include <stdio.h>

int main() {
    int n;
    
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements of the array:\n", n);
    for (int i = 0; i < n; i++) 
	{
        scanf("%d", &arr[i]);
    }

    for (int i = 0; i < n; i++) 
	{
        for (int j = i + 1; j < n;) 
		{
            if (arr[j] == arr[i]) 
			{
                for (int k = j; k < n - 1; k++) 
				{
                    arr[k] = arr[k + 1];
                }
                n--; 
            } 
			else 
			{
                j++; 
            }
        }
    }

    printf("Array after removing duplicates:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
