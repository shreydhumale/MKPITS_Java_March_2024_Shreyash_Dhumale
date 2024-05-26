/* WAF to accept a number as an argument and check wheather it is armstrong or not */
int Armstrong(int n);
main()
{
	int num, n, rem, result=0;
    printf("Enter a three-digit integer: ");
    scanf("%d", &num);
    n = num;	
    Armstrong(n);
    if (result == n)
        printf("%d is an Armstrong number.", n);
    else
        printf("%d is not an Armstrong number.", n);
    
}
int Armstrong(int n)
{
	int rem,result=0,num;
	 while (n!= 0) 
	{
        rem= n % 10;
        result += rem* rem * rem;
        n /= 10;
    }
     return n==result;
  
}
