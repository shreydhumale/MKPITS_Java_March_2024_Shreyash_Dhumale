package Synchronization;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        Sender sender = new Sender();
        ThreadSend s1 = new ThreadSend("Hi", sender);
        s1.start();
        synchronized (s1){
            s1.notify();
        }
        ThreadSend s2 = new ThreadSend("bye", sender);
        s2.start();
        synchronized (s2){
            s2.start();
        }

        }
    }

