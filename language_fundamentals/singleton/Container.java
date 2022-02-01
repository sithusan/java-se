package language_fundamentals.singleton;

public class Container {
    private String[] array;

    private static Container container;

    public static Container getContainer() {

        if (null == container) {
            container = new Container();
        }
        return container;
    }

    private Container() {
        this.array = new String[0];
    }

    public void add(String str) {
        String[] temp = new String[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }

        temp[temp.length - 1] = str;

        array = temp;
    }

    public String[] getArray() {
        return array;
    }
}
