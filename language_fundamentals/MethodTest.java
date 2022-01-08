public class MethodTest {
    public static void main(String[] args) {
        MethodTest obj = new MethodTest();
        obj.showAddResult(1, 2);

        sayHello();

        int result = add(1, 2);
        System.out.println(result);

        OtherMethod.showMessage("From Other Method");
    }

    public void showAddResult(int a, int b) {
        System.out.println(a + b);
    }

    public static void sayHello() {
        System.out.println("Hello World");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
