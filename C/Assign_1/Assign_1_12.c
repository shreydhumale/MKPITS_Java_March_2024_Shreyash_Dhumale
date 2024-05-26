/* Develop a program that calculates the total number of days in a given
   month based on the month number and the year using switch-case.*/
   
#include<stdio.h>
main()
{
	int m;
	printf("Enter month number: ");
	scanf("%d",&m);
	
	switch(m)
	{
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		printf("31 days");
		break;
	
	case 4:
	case 6:	
	case 9:
	case 11:
		printf("30 days");
		break;
	
	case 2:
		printf("28/29 days");
		break;
	
	default: 
            printf("Invalid input! Please enter month number between 1-12");
	}
}
