package language_fundamentals.writing_packages.com.java.teaching;

public class Lesson {

    private String name;
    private Course course;

    public Lesson(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void showInfo() {
        System.out.println("This is " + this.name + "Lesson from " + this.course.name);
    }
}
