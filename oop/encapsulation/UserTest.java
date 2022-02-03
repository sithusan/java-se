package oop.encapsulation;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Aung Aung", 20);

        UserInterface user1 = user;

        System.out.println(user1.getName());
        System.out.println(user1.getAge());
    }
}
