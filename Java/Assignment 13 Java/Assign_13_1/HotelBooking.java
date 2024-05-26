package Assign_13_1;

public class HotelBooking extends Thread implements Runnable {
    public static double income = 1000;

    public void run() {

        income = income + 1000;
        System.out.println("Room booked" + currentThread().getName());
        System.out.println("total earning" + income);
        synchronized (this) {
            this.notify();
        }
    }
}