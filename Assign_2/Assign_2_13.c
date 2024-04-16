/* Write a C program to find the number of digits in the factorial of a given number */

#include<stdio.h>
main()
{
	int num,factorial,i=1,count;
	factorial=i;
	printf("Enter a number:");
	scanf("%d",&num);
	for(;i<=num;i++)
	{
		factorial=factorial*i;
		
	}
	printf("The factorial of %d is:%d\n",num,factorial);
	while(factorial!=0)
	{
		factorial=factorial/10;
		count++;
	}
	printf("digits=%d",count);
	
}
