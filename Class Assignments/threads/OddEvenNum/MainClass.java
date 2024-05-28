package PrimeNumber;

public class MainClass {
    public static void main(String[] args) {
        InnerOuter innerOuter=new InnerOuter();
        EvenNum evenNum=new EvenNum();
        OddNum oddNum=new OddNum();
        evenNum.start();
        oddNum.start();
    }
}
