/* Write a C program to print all prime numbers between 1 to N */

#include<stdio.h>
int main()
{
  	int n,i,num,prime,m;
  	printf("Enter N value: ");
  	scanf("%d",&n);
  	printf("Prime number from 1 to %d are: ",n);
	    	
	for(i=1;i<=n;i++)
	{
		m=i;
		prime=0;
		for(num=2;num<m;num++)
			{
				if(m%num==0)
				{
					prime=1;
					break;
				}
			}
			if(prime==0)
				printf("\n%d ",m);
	}
}
