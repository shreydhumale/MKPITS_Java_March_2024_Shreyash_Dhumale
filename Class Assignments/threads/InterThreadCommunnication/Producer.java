package InterThreadCommunnication;

public class Producer extends Thread{
    Company company;;
    Producer (Company company) {
        this.company=company;
    }

    public void run() {
        int i=1;
        while (true) {
            try {
                company.produced_items(i);
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
