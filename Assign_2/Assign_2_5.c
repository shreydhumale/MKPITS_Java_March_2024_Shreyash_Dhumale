/* Write a C program to print all Armstrong numbers between 1 and N */

#include <math.h>
#include <stdio.h>

int main()
{
	int i, num, n, digit, sum;
	printf("Enter N value: ");
	scanf("%d",&n);
	printf("Armstrong numbers between 1 to %d are: ",n);

	for (i = 1; i <=n; i++) 
		{
			num=i;
			sum=0;
			while(num!=0)
			{
				digit=num%10;
				sum=sum+digit*digit*digit;
				num=num/10;
			}
			if(i==sum)
				printf("%d ",i);		
		}
}

