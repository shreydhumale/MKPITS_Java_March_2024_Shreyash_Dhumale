/* Write a program to display the name of the month based on the
   given number using switch-case.*/
   
#include<stdio.h>
main()
{
	int m;
	printf("Enter your number: ");
	scanf("%d",&m);
	
	switch(m)
	{
	case 1:
		printf("January");
		break;
	
	case 2:
		printf("Febuary");
		break;
		
	case 3:
		printf("March");
		break;
		
	case 4:
		printf("April");
		break;
		
	case 5:
		printf("May");
		break;
		
	case 6:
		printf("June");
		break;
		
	case 7:
		printf("July");
		break;	
		
	case 8:
		printf("August");
		break;
		
	case 9:
		printf("September");
		break;	
		
	case 10:
		printf("October");
		break;
		
	case 11:
		printf("November");
		break;
		
	case 12:
		printf("December");
		break;	
	}	
		
}
