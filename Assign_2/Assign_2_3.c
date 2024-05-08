/* Develop a program to calculate the power of a number using a for loop */

#include<stdio.h>
main()
{
	int m,n,val=1;
	printf("Enter a number:");
	scanf("%d",&m);
	printf("Enter power:");
	scanf("%d",&n);
	for(int i=0;i<n;i++)
	{
		val=val*m;
	}
	printf("the value of %d to the power %d is %d",m,n,val);
}