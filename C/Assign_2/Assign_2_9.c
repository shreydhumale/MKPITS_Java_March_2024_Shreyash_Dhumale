/*  Write a C program to convert a decimal number to binary */

#include<stdio.h>
main()
{
	int decimal, binary=0, i=1, remainder;
	printf("Enter a decimal number: ");
	scanf("%d",&decimal);
	
	for(decimal!=0;i=i*10;)
	{
		remainder=decimal%2;
		decimal=decimal/2;
		binary+=remainder*i;
	}
	printf("Binary number:%d",binary);
	
}