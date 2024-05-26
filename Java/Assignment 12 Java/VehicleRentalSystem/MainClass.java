package VehicleRentalSystem;

public class MainClass {
    public static void main(String[] args) {
        Rentable details = new Rentable() {

            @Override
            public void displayDetails() {
                System.out.println("truck details");
            }

            @Override
            public void calculateRent() {
                System.out.println("rent of truck");
            }
        };

        Rentable bike = new Rentable() {

            @Override
            public void displayDetails() {
                System.out.println("bike details");
            }

            @Override
            public void calculateRent() {
                System.out.println("rent of bike");
            }
        };

        Rentable car = new Rentable() {

            @Override
            public void displayDetails() {
                System.out.println("car details");
            }

            @Override
            public void calculateRent() {
                System.out.println("rent of car");
            }
        };
    }
}
