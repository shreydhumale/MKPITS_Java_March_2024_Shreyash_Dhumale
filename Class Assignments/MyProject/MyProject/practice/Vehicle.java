abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("car starts with key");
    }
}

class MainClass {

    public static void main(String args[]) {
        System.out.println("scooter starts with kick");
    }
    {
        Car c=new Car();
        c.start();
    }
}
