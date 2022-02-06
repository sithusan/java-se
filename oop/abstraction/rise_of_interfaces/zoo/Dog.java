package oop.abstraction.rise_of_interfaces.zoo;

public class Dog extends Canine implements Pet {
    public Dog() {

    }

    public void eat() {
        System.out.println("Dog eats dog food");
    }

    public void shakeHand() {
        System.out.println("Dog shakes hand");
    }
}
