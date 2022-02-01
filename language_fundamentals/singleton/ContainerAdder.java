package language_fundamentals.singleton;

public class ContainerAdder {

    private Container container;

    public ContainerAdder() {
        container = Container.getContainer();
    }

    public void add(String str) {
        container.add(str);
        System.out.println("Adding a string " + str);
    }
}
