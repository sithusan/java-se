package oop.inheritance;

public class Truck extends Car {
    public Truck() {
        super(3);
    }

    @Override
    public void drive() {
        System.out.printf("Truck is driving with speed of %d km/h\n", gearPower);
    }
}
