/* Create a program to check if a given number is a palindrome or not*/

#include<stdio.h>
main()
{
	int n,reverse,remainder,original;
	printf("Enter a number:");
	scanf("%d",&n);
	original=n;
	

	for(reverse=0;n>0;n=n/10)
 	{
    remainder = n % 10;
    reverse = reverse * 10 + remainder;
    }
	if(original==reverse)
		printf("It is a palindrome number.");
	else
		printf("It is not a palindrome number.");
}
