package language_fundamentals.writing_packages.com.java.registration;

import language_fundamentals.writing_packages.com.java.teaching.Course;

public class Student {
    String name;
    Course course;

    private static int count;

    public Student(String name) {
        count++;
        this.name = name;
    }

    public void takeCourse(Course course) {
        this.course = course;
    }

    public void sayYourCourse() {
        System.out.println("My name is " + this.name + ".");
        System.out.println("I am taking " + this.course.name + ".");
    }

    public static void showStudentCount() {
        System.out.println("All Student : " + count);
    }
}
