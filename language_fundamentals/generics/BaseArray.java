package language_fundamentals.generics;

public interface BaseArray<T> {
    void add(T t);

    T get(int index);
}
