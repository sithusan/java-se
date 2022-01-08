public class Person {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Si Thu San";
        student.age = 20;

        student.greet();
    }
}

// need to separate
class Student {
    String name;
    int age;

    void greet() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
}