package oop.inheritance;

public class Car {

    protected int gearPower;

    public Car(int gearPower) {
        this.gearPower = gearPower;
    }

    public void drive() {
        System.out.printf("Car is driving with speed of %d km/h\n", this.gearPower);
    }
}
