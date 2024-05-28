package InterThreadCommunnication;

public class Consumer extends Thread {
    Company company;
    public Consumer(Company company){
        this.company=company;
    }
    public void run()  {
        while (true){
            int i=1;
            try {
                company.consumed_items();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
