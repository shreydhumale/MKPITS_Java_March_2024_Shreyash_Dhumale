import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number:");
        int num=sc.nextInt();
        System.out.println("number= "+ num);



        /* int num1=20;
        long num2=30l;
        double num3=39.4;
        float num4=43.32f;
        char ch='S';
        boolean flag=true;
        String str="shreyash";
        System.out.println("Number 1= "+num1);
        System.out.println("Number 2= "+num2);
        System.out.println("Number 3= "+num3);
        System.out.println("Number 4= "+num4);
        System.out.println(ch);
        System.out.println(str);
        System.out.println(flag);
         */
        int num=0;
        int i=0;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();

        for(num=2;num<number;num++){
            if(number%num==0)
                count=count+1;
        }
        if(count==0)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}

