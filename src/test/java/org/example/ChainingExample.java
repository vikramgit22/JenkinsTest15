package org.example;

public class ChainingExample {

    // Method A
    public ChainingExample A() {
        System.out.println("Method A");
        return this; // Return the current object
    }

    // Method B
    public ChainingExample B() {
        System.out.println("Method B");
        return this; // Return the current object
    }

    // Method C
    public ChainingExample C() {
        System.out.println("Method C");
        return this; // Return the current object
    }

    // Main method to test chaining
    public static void main(String[] args) {
        ChainingExample example = new ChainingExample();
        example.A().B().C(); // Method chaining
    }
}
