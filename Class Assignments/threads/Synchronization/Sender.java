package Synchronization;

public class Sender {
    public synchronized void send(String msg) throws InterruptedException {
        while (true) {
            System.out.println("Sending...\t" + msg);
            System.out.println( msg + " sent");
        }
    }
}
