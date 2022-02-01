package language_fundamentals.singleton;

public class ContainerTest {
    public static void main(String[] args) {

        ContainerAdder adder = new ContainerAdder();
        adder.add("Hello Java");
        adder.add("Singleton");

        Container container = Container.getContainer();

        for (String str : container.getArray()) {
            System.out.println(str);
        }
    }
}
