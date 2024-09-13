package OOPS.Abstract;

abstract class Animal
{
    abstract void makeSound();

    void display()
    {
        System.out.println("sound----");
    }
}

class Dog extends Animal
{

    @Override
    void makeSound() {
        System.out.println("its a dog");
    }
}

public class AbstDemo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.display();
        dog.makeSound();
        Animal animal = new Dog();
        animal.display();
        animal.makeSound();

    }


}
