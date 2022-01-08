public class LocalVariableTest {

    String message = "Global Variable";

    public static void main(String[] args) {
        LocalVariableTest obj = new LocalVariableTest();
        obj.doSomething();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void doSomething() {
        String message = "Local Variable";
        System.out.println(this.message);
    }
}
