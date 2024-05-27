package Vehicle;

public class TwoWhiller extends Car implements MotorBIke {

    TwoWhiller(String name) {
        super(name);
    }

    @Override
    public void speed() {
        System.out.println("Speed: 90Km/Hr");
    }

    public void distance(){
        System.out.println("distance:50 meters");
    }
}
