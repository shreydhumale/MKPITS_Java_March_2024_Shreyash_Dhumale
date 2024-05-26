/* Develop a program to calculate the average of N numbers entered by the user */

#include<stdio.h>
main()
{
int  num, count, n, sum=0, avg=0;
    	
	printf("Enter number of digit you want average of:\n");
	scanf("%d",&n);
	
	printf("enter %d numbers:\n",n);
	for(count=1;count<=n;count++)
	{
		scanf("%d",&num);
		sum=sum+num;
	}
	avg=sum/n;
	printf("sum =%d\nAverage=%d\n",sum,avg);
}