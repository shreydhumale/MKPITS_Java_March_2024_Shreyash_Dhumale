package Assign_13_1;

public class MainClass {
    public static synchronized void main(String[] args) throws InterruptedException {
        int room = 10;
        for (int i = 1; i <= 11; i++) {
            HotelBooking hotelBooking = new HotelBooking();
            hotelBooking.start();
            synchronized (hotelBooking) {
                try {
                    hotelBooking.wait();
                } catch (InterruptedException e) {
                }
            }
        }
    }
}

