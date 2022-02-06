package oop.interfaces;

public class Aeroplane extends Vehicle implements Flyable {

    @Override
    public void drive() {
        System.out.println("Aeroplane is flying.");
    }

    public void fly() {
        drive();
    }

}
