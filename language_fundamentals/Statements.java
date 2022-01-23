package language_fundamentals;

public class Statements {

    void showMessage() {
        System.out.println("Hello Statements!");
    }

    public static void main(String[] args) {

        // declearation statement
        int i;
        String str;
        Statements test;
        int[] array;

        // assignment statement
        i = 20;
        str = "Hello Java";

        // Object Createion Statement
        test = new Statements();

        // Array Creation Statement
        array = new int[3];

        // increment statement
        i++;

        System.out.println(i);

        i--;
        System.out.print(i);

        // Method Invocation Statement
        test.showMessage();
    }
}
