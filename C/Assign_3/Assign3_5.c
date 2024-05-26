/* WAF to accept a number as an argument and return its factorial */

#include<stdio.h>
int factorial(int num);
int main() 
	{
    int i, num,f;

    printf("Enter a number: ");
    scanf("%d",&num);
    
    f=factorial(num);
    printf("factorial is: %d",f);
	}

int factorial(int num)
{
	int fact=1, i;
	for( i=1; i<=num; i++)
	{
         fact=fact*i;
    }
    return fact;
}
