/* Create a C program to find the sum of the series 1 + 1/2 + 1/3 + ... + 1/N */

#include<stdio.h>
main()
{
	int n,i;
	float sum=0;
	printf("\nEnter a number:");
	scanf("%d",&n);
	printf("\nseries:");
	
	for(i=1;i<=n;i++)
	{
		sum=sum+((float)1/(float)i);
		printf("%d/%d ",1,i);
	}
	printf(" \n\nSum of series=%f\n",sum);
}