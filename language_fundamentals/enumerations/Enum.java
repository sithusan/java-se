package language_fundamentals.enumerations;

public class Enum {

    public static void main(String[] args) {
        Course[] courses = Course.values();

        for (Course course : courses) {
            System.out.println(course);
            System.out.println(course.getFee());
            course.showFee();
            int fee = course.getFee();
            System.out.printf("%s : %d MMK %n", course.toString(), fee);

            FeesShowable showable = course;
            showable.showFeesWithFormat();
        }

        Course c = Course.valueOf("JavaSE");
        System.out.println(c);
    }
}
