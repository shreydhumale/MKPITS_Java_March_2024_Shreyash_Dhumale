/* WAF to accept a marks as an argument and if it is >=50 the display "Pass" otherwise display "Fail" */

#include<stdio.h>

void result(int m)
{
	if(m>=50)
		printf("pass \n",m);
	else
		printf("fail \n",m);
}

main()
{
	int m;
	printf("Enter marks: ");
	scanf("%d",&m);
	result(m);
}

