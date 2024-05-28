package InterThreadCommunnication;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Company company = new Company();
        Producer producer=new Producer(company);
        producer.start();
        Consumer consumer=new Consumer(company);
        consumer.start();
    }
}
