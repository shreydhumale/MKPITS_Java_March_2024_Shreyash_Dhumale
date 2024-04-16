/* Develop a program to calculate the sum of the series 1/1! + 2/2! + 3/3! + ... + N/N! */

#include<stdio.h>
main()
{
	int n,i=1,c;
	float sum=0.0,factorial;
	printf("\nEnter a number:");
	scanf("%d",&n);
	
	while(i<=n)
	{
		factorial=1;
		for(c=1;c<=n;c++)
		{
			factorial=factorial*c;
		}
		sum=sum+(n/factorial);
		i++;
	}
	printf(" \n\nSum of series=0.2%f\n",sum);
}