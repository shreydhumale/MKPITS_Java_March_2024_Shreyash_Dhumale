import java.util.Scanner;

public class Const {
    protected void Const(int a,int b) {
        System.out.println(a+b);
    }
    protected void Constt(){
        this.Const(2,4);
    }

    public void Const2(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int A=scanner.nextInt();
        System.out.println("Enter 2nd number");
        int B=scanner.nextInt();
        System.out.print("sum=");
        System.out.println(A+B);
    }
}
