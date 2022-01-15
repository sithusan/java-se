package language_fundamentals.writing_packages.com.java;

import language_fundamentals.writing_packages.com.java.registration.*;
import language_fundamentals.writing_packages.com.java.teaching.*;

public class PackageTest {
    public static void main(String[] args) {
        Course course = new Course("Java SE");

        Student student = new Student("Aung Aung");
        student.takeCourse(course);

        student.sayYourCourse();
    }
}
