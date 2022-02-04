package oop.inheritance;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car(100);
        car.drive();

        Car truck = new Truck();
        truck.drive();
    }
}
