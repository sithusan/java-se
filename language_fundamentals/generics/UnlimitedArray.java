package language_fundamentals.generics;

public class UnlimitedArray<T> implements BaseArray<T> {

    private Object[] array;

    public UnlimitedArray() {
        array = new Object[] {};
    }

    @Override
    public void add(T o) {
        Object[] temp = new Object[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }

        temp[temp.length - 1] = o;
        array = temp;
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

}
