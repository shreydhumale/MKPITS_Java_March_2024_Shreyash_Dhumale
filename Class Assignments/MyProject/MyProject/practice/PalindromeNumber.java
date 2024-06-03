import java.util.Scanner;
class PalindromeNumber
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int temp=n;
        int rev=0,rem;
        while(temp !=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(n==rev)
        {
            System.out.println(n+" is a palindrome number");
        }
        else
        {
            System.out.println(n+" is not a palindrome number");
        }
    }
}