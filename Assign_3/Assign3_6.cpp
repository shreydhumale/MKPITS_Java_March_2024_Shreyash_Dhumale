/* WAF to accept a number as an argument and return its reverse */

#include<stdio.h>
int FindReverse(int n);
main()
{
	int n,reverse,remainder;
	printf("Enter a number:");
	scanf("%d",&n);
	FindReverse(n);
}

int FindReverse(int n)
{
	int remainder, reverse;
	while (n > 0)
 	{
    remainder = n % 10;
    reverse = reverse * 10 + remainder;
    n =n/ 10;
    }
    printf("reverse:%d",reverse);
}
