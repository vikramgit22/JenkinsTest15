package OOPS;

// Base class
class Vehicle {
    // Common attributes for all vehicles
    String brand;
    int speed;

    // Constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display vehicle information
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }

    // Common method for all vehicles
    void startEngine() {
        System.out.println("Engine started.");
    }
}

// Derived class
class Car extends Vehicle {
    // Specific attribute for Car
    int numberOfDoors;

    // Constructor
    Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed); // Call the constructor of the superclass (Vehicle)
        this.numberOfDoors = numberOfDoors;
    }

    // Method specific to Car
    void openSunroof() {
        System.out.println("Sunroof opened.");
    }

    // Overriding the displayInfo method to include specific Car information
    @Override
    void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

// Main class
public class InheriDemo {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Vehicle vehicle = new Car("Toyota", 120, 4);  //upcasting.
        Car car = (Car) vehicle;   //downlasting.
        car.openSunroof();
        car.startEngine();
        //Car car = new Car("Toyota", 120, 4);
        vehicle.displayInfo();
        vehicle.startEngine();

       /* car.startEngine(); // Inherited method
        car.displayInfo(); // Overridden method
        car.openSunroof(); // Method specific to Car*/

        System.out.println(); // Line break

    }
}
