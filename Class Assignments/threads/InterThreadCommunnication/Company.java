package InterThreadCommunnication;

public class Company {
    int n;
    boolean f=false;
    public synchronized void produced_items(int n) throws InterruptedException {
        if(f){
            wait();
        }
        this.n=n;
        System.out.println("prodeced.." +n);
        f=true;
        notify();
    }
    public synchronized void consumed_items() throws InterruptedException {
        if(!f){
            wait();
        }
        System.out.println("consumed.." +n);
        f=false;
        notify();
    }
}
