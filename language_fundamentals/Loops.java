package language_fundamentals;

public class Loops {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d - %d%n", i, array[i]);
        }

        int average = getAverage(array);
        System.out.println("Average:" + average);

        doWhileLoop(array);
        whileLoop(array);
    }

    public static int getAverage(int[] array) {
        int sum = 0;

        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static void doWhileLoop(int[] array) {
        int i = 0;
        do {
            System.out.printf("%d - %d%n", i, array[i]);
            i++;
        } while (i < array.length);
    }

    public static void whileLoop(int[] array) {
        int i = 0;

        while (i < array.length) {
            System.out.printf("%d - %d%n", i, array[i]);
            i++;
        }
    }
}
