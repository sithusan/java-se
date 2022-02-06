package oop.interfaces;

public class InterfaceTest {
    public static void main(String[] args) {

        drive(new Car());
        drive(new Aeroplane());

        fly(new Aeroplane());
        fly(new Drone());

        // anyonymous interface
        Flyable bird = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Bird is flying.");
            }
        };
        fly(bird);

    }

    static void drive(Vehicle vehicle) {
        vehicle.drive();
    }

    static void fly(Flyable flyable) {
        flyable.fly();
    }
}
