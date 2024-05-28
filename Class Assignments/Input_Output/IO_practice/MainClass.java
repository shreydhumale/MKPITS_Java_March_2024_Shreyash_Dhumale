package IO_practice;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args)throws IOException {
        InputStreamReader io=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(io);
        System.out.println("Enter a value");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter a value");
        int b=Integer.parseInt(br.readLine());
        System.out.println("sum="+a+b);
        //OR
        BufferedInputStream bufferedInputStream=new BufferedInputStream(System.in);
        System.out.println("Enter Your Name");
        String c=br.readLine();
        BufferedInputStream bufferedInputStream1=new BufferedInputStream(System.in);
        System.out.println("Enter your Stream");
        String c1=br.readLine();
        System.out.println(c);
        System.out.println(c1);
    }
}
