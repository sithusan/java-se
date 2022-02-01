package language_fundamentals.singleton;

public enum EnumAsSingleton {

    Container;

    private String[] array;

    private EnumAsSingleton() {
        array = new String[0];
    }

    public void add(String str) {
        String[] tmp = new String[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }

        tmp[tmp.length - 1] = str;
        array = tmp;
    }

    public String[] getArray() {
        return array;
    }
}
