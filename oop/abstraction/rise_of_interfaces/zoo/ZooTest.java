package oop.abstraction.rise_of_interfaces.zoo;

public class ZooTest {
    public static void main(String[] args) {

        Feline f1 = new Cat();
        Feline f2 = new Lion();
        Feline f3 = new Tiger();

        eat(f1);
        eat(f2);
        eat(f3);

        eat(new Hippo());
        eat(new Dog());

        shakeHand(new Dog());
        shakeHand(new Cat());
    }

    public static void eat(Animals cat) {
        cat.eat();
    }

    public static void shakeHand(Pet pet) {
        pet.shakeHand();
    }
}
