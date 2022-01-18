package language_fundamentals;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {
        Student student = new Student();

        byte b = 3;
        short s = 20;
        int i = 10;
        long l = 100;

        l = i;
        l = b;
        b = (byte) l;

        takeValue(1.0f);

    }

    static void takeValue(byte b) {
        System.out.println("Byte is working");
    }

    static void takeValue(short s) {
        System.out.println("Short is working");
    }

    static void takeValue(int i) {
        System.out.println("Int is working");
    }

    static void takeValue(long l) {
        System.out.println("Long is working");
    }

    static void takeValue(Float f) {
        System.out.println("Float is working");
    }

    static void takeValue(Double d) {
        System.out.println("Double is working");
    }
}

class Student {

}
