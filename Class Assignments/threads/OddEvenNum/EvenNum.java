package PrimeNumber;

public class EvenNum extends Thread implements Runnable{
    public void run(){
        for (int i=0;i<=1000;i+=2){
                System.out.println("Even numbers" +i);
            }
        }
    }


