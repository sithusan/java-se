package oop.composition;

import java.util.Scanner;

public class MyScanner {

    private Scanner scanner;

    MyScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String scanLine(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
