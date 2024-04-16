/* WAF to accept 2 numbers as an argument and return greater */

#include <stdio.h> 
 
int findMax(int a, int b) 
{ 
    if (a >= b && a >= b) 
	{ 
        return a;  
    } else 
	{ 
        return b; 
	}
} 
 
int main() { 
    int num1, num2; 
     
    printf("Enter two numbers: "); 
    scanf("%d %d", &num1, &num2); 
 
    int great = findMax(num1, num2); 
 
    printf("The greatest number is %d\n", great); 
 
    return 0; 
}	
