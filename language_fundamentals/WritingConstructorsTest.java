public class WritingConstructorsTest {
    public static void main(String[] args) {
        
        WritingConstructors obj = new WritingConstructors(
                "Car",
                "Toyota");
        obj.showInfo();

        WritingConstructors obj2 = new WritingConstructors(
                "Bike",
                false);
        obj2.showInfo();

        WritingConstructors obj3 = new WritingConstructors();
        obj3.showInfo();
    }
}