package PrimeNumber;

public class OddNum extends Thread implements Runnable{
    public void run(){
         for(int i=1;i<1000;i+=2){
                System.out.println("odd numbers" +i);
            }
        }
    }

