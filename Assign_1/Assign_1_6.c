/*  Write a program that categorizes a given person's BMI (Body Mass Index) into
	different weight categories (underweight, normal weight, overweight, obese) 
	using if statements.*/
	
#include <stdio.h> 
#include <math.h> 


int main() 
{ 
	float height,weight,bmi;
	printf("Enter Body weight:");
	scanf("%f",&weight);
	printf("Enter height:");
	scanf("%f",&height); 
	bmi=weight/(height*height);
	
	{
	if (bmi < 18) 
		{
		printf ("underweight");
		}
	else if (bmi >= 18 && bmi < 25) 
		{
		printf("normal"); 
		}
	else if (bmi >= 25 && bmi < 30) 
		{
		printf("overweight"); 		
		}
	else 
		{
		printf("obese"); 
		}
	}
	return 0; 
} 


