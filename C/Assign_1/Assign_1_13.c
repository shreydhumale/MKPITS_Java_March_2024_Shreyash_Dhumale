/* Write a program that determines the day of the week based on the
   given number (1 for Sunday, 2 for Monday, etc.) using switch-case.*/
   
#include<stdio.h>
main()
{
	int w;
	printf("Enter your number: ");
	scanf("%d",&w);
	
	switch(w)
	{
	    case 1:
		printf("Monday");
		break;
		
		case 2:
		printf("Tuesday");
		break;
		
		case 3:
		printf("Wednesday");
		break;
		
		case 4:
		printf("Thursday");
		break;
		
		case 5:
		printf("Friday");
		break;
		
		case 6:
		printf("Saturday");
		break;
		
		case 7:
		printf("Sunday");
		break;
		
		default: 
            printf("Invalid input! Please enter month number between 1-7");	
    }
}
