package language_fundamentals;

public class Constants {
    static final int MAX_COUNT;

    static final int SUNDAY = 0;
    static final int MONDAY = 1;
    static final int TUESDAY = 2;
    static final int WEDNESDAY = 5;

    public static void main(String[] args) {
        showDay(1);
    }

    static {
        MAX_COUNT = 10;
    }

    static void showDay(int day) {
        switch (day) {
            case SUNDAY:
                System.out.println("Sunday");
                break;
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
