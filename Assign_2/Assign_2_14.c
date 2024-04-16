/* Write a C program to calculate the sum of the first N natural numbers that are divisible by both 3 and 5 */

#include<stdio.h>
main()
	{
	int i,a,b,sum=0;
	printf("Enter first number: ");
	scanf("%d",&a);
	printf("Enter last number: ");
	scanf("%d",&b);
	
	
	for(i=a;i<=b;i++){
		{
			if(i%3==0 && i%5==0)
			sum=sum+i;
		}	
	}
	printf("Sum of first %d natural numbers which are divisible by both 3 and 5 is:%d",b,sum);

	}