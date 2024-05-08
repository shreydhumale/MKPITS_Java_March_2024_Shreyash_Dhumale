/* 1.Write a program that determines the type of a given triangle (equilateral, 
      isosceles, or scalene) based on its side lengths using if statements.*/
      
#include<stdio.h>
main(){
	int a,b,c;
	printf("enter 1st side of triangle:");
	scanf("%d",&a);
	
	printf("enter 2nd side of triangle:");
	scanf("%d",&b);
	
	printf("enter 3rd side of triangle:");
	scanf("%d",&c);
	
	if (a==b&&b==c)
		printf("it is an equilateral triangle");
	
	else if (a==b||b==c||c==a)
		printf("it is an isosceles triangle");
	
	else 
		printf("it is a scalene triangle");
}
