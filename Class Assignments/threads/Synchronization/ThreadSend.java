package Synchronization;

public class ThreadSend extends Thread{
    private String msg;
    Sender sender;

    ThreadSend(String m, Sender obj){
        msg=m;
        sender=obj;
    }
    public void run(){
        synchronized (sender){
            try {
                sender.send(msg);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                sender.send(msg);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
