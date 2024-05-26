//10. Count the number of occurances of numbers in an arrray of integers

#include <stdio.h>

void occurrence();

int main() 
{
    occurrence();
    return 0;
}

void occurrence() 
{
    int arr[100], size, i, j;

    printf("Enter size of array:");
    scanf("%d", &size);

    printf("Enter %d numbers:", size);
    for (i = 0; i < size; i++)
    scanf("%d", &arr[i]);

    printf("Occurrences of each number:\n");
    for (i=0; i<size; i++) 
    {
        int count = 0;
        int alreadyCounted = 0;

        for (j=0; j<i; j++) 
        {
            if (arr[j] == arr[i]) 
            {
                alreadyCounted = 1;
                break;
            }
        }
        if(alreadyCounted!=1)
        {
                for (j=0; j<size; j++) 
                {
                    if (arr[i] == arr[j])
                    count++;
                }
            printf("%d occured %d times\n", arr[i], count);
        }
    }
}