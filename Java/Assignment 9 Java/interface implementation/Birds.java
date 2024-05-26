package JavaAssignment_9;

class Birds implements Animal{
    @Override
    public void eat() {
        System.out.println("Birds eat grains");
    }

    @Override
    public void sleep() {
        System.out.println("Birds sleep at night");
    }

    @Override
    public void makeSound() {
        System.out.println("Birds chirps");
    }
}
