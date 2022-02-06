package oop.composition;

import java.util.Scanner;

public class PrinterTest {
    public static void main(String[] args) {
        MyScanner scanner = new MyScanner(new Scanner(System.in));

        Printer printer = new Printer(scanner);
        printer.print("What is your name ? : ");
    }
}
