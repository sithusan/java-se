package language_fundamentals.writing_packages.com.java;

import language_fundamentals.writing_packages.com.java.registration.*;
import language_fundamentals.writing_packages.com.java.teaching.*;
// static import
import static language_fundamentals.writing_packages.com.java.registration.Student.showStudentCount;;

public class PackageTest {
    public static void main(String[] args) {
        Course course = new Course("Java SE");

        Student student = new Student("Aung Aung");

        student.takeCourse(course);

        student.sayYourCourse();

        showStudentCount();
    }
}
