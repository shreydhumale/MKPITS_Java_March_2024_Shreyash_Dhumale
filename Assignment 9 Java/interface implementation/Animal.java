package JavaAssignment_9;

public interface Animal {
    public void eat();
    public void sleep();
    public void makeSound();

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.sleep();
        dog.makeSound();

        Cat cat=new Cat();
        cat.eat();
        cat.sleep();
        cat.makeSound();

        Birds birds=new Birds();
        birds.eat();
        birds.sleep();
        birds.makeSound();
    }
}
