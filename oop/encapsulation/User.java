package oop.encapsulation;

public class User implements UserInterface {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}