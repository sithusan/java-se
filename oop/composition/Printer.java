package oop.composition;

public class Printer {

    private MyScanner scanner;

    public Printer(MyScanner scanner) {
        this.scanner = scanner;
    }

    public void print(String message) {
        String result = scanner.scanLine(message);
        System.out.printf("You said : %s\n", result);
    }
}
