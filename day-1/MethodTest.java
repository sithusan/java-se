import java.lang.reflect.Method;

public class MethodTest {
    public static void main(String[] args) {
        MethodTest.showAddResult(1, 2);
        MethodTest.sayHello();
        MethodTest.add(1, 2);
    }

    public static void showAddResult(int a, int b) {
        System.out.println(a + b);
    }

    public static void sayHello() {
        System.out.println("Hello World");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
