package JavaAssignment_9;

class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("Dog eats bread");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps at night");
    }

    @Override
    public void makeSound() {
        System.out.println("Dogs bark");
    }
}
