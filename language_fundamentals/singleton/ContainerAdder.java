package language_fundamentals.singleton;

public class ContainerAdder {

    private Container container;

    // Enum as Singleton
    private EnumAsSingleton enumAsSingleton;

    public ContainerAdder() {
        container = Container.getContainer();

        // enum as Singleton
        enumAsSingleton = EnumAsSingleton.Container;
    }

    public void add(String str) {
        container.add(str);
        System.out.println("Adding a string " + str);
    }

    // enum as Singleton
    public void addEnum(String str) {
        enumAsSingleton.add(str);
        System.out.println("Adding a string " + str);
    }

}
