package JavaAssignment_9;

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps at night");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat makes meow sound");
    }
}
