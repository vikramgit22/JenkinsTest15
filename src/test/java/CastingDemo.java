
/*
     Type Casting : converting one datatype to another.
     Primitive  :  converting one primitive type to another.
     Ref type  :  converting between compatiable object types
                 -- upcasting[subclass ref to superclass ref]
                 -- downcasting[superclass ref to subclass ref]


 */


class Animal
{
    void makeSound()
    {
        System.out.println("Animal sounc");
    }
}

class Dog extends Animal
{
    void makeSound() {
        System.out.println("Bark");
    }

    void fetch() {
        System.out.println("Dog fetching...");
    }
}


public class CastingDemo {

    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.makeSound();
        Dog d = (Dog) animal;
        d.fetch();

        Dog dog = new Dog();
        Animal a = dog;
        Dog d1 = (Dog) a;
        d1.fetch();

        int i=100;
        double o = (double) i;
        System.out.println(o);
    }
}



