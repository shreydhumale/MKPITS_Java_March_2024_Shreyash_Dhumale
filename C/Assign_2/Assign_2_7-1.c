/*
	1
	12
	123
	1234
	12345
*/

int main()
{
	int i,j,n=5;
	
	for (int i = 1; i <= n; i++) 
	{

		for (int j = 1; j <= i; j++)
		{
			printf("%d",i);
		}
		printf("\n");
	}
	return 0;
}
