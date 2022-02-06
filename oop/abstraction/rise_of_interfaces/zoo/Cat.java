package oop.abstraction.rise_of_interfaces.zoo;

public class Cat extends Feline implements Pet {
    public Cat() {

    }

    public void eat() {
        System.out.println("Cat eats mice");
    }

    public void shakeHand() {
        System.out.println("Cat shakes hand");
    }
}
