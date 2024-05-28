package PrimeNumber;

public class InnerOuter extends Thread {
    public static class EvenNum{
        public void run(){
            for (int i=2;i<=1000;i+=2){
                System.out.println("Even numbers" +i);
            }
        }
    }
    public static class OddNum{
        public void run(){
            for(int i=1;i<1000;i+=2){
                System.out.println("odd numbers" +i);
            }
        }
    }
}
