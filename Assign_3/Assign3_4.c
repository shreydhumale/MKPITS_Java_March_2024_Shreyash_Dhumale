/* WAF to accept 3 numbers as an argument and return greatest. */

#include <stdio.h> 
 
int findMax(int a, int b, int c) { 
    if (a >= b && a >= c) { 
        return a; 
    } else if (b >= a && b >= c) { 
        return b; 
    } else { 
        return c; 
    } 
} 
 
int main() { 
    int num1, num2, num3; 
     
    printf("Enter three numbers: "); 
    scanf("%d %d %d", &num1, &num2, &num3); 
 
    int max = findMax(num1, num2, num3); 
 
    printf("The greatest number is %d\n", max); 
 
    return 0; 
}	
	